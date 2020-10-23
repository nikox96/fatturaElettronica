/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatturaelettronica;

import fatturaelettronica.ordinaria.*;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Nicolò
 * @version: 1.6.1
 * @todo:
 */
public class FatturaElettronica {

    static ObjectFactory xml;

    static JAXBContext jaxbContext;
    static Marshaller marshaller;
    static FileWriter fw;
    static String cf, appdata;
    static BufferedWriter bwe = null;

    static FatturaElettronicaType root;
    static FatturaElettronicaBodyType fattBody;
    static FatturaElettronicaHeaderType fattHeader;
    static DatiTrasmissioneType datiTrasm;
    static ContattiTrasmittenteType contattiTrasm;
    static CedentePrestatoreType ced;
    static RappresentanteFiscaleType headRapprFis;
    static RappresentanteFiscaleCessionarioType cessRapprFis;
    static CessionarioCommittenteType cess;
    static TerzoIntermediarioSoggettoEmittenteType terzo;

    static DatiAnagraficiCedenteType cedAna;
    static DatiAnagraficiRappresentanteType rapprAna;
    static DatiAnagraficiCessionarioType cessAna;
    static DatiAnagraficiTerzoIntermediarioType terzoAna;
    static IdFiscaleType idTrasm, cedAnaIdFis, rapprAnaIdFis, cessAnaIdFis, cessRapprFisIdFis, terzoAnaIdFis, datiTraspAnaIdFis;
    static AnagraficaType cedAnaAna, rapprAnaAna, cessAnaAna, terzoAnaAna, datiTraspAnaAna;
    static IndirizzoType cedSede, cedStab, cessSede, cessStab, datiTraspInd;
    static ContattiType cedContatti;
    static IscrizioneREAType cedRea;

    static AllegatiType fattBodyAllegato;
    static DatiPagamentoType fattBodyDatiPag;
    static DatiBeniServiziType fattBodyDatiBeniSrv;
    static DatiGeneraliType fattBodyDatiGen;
    static DatiVeicoliType fattBodyDatiVeicoli;
    static DettaglioPagamentoType fattBodyDettPag;
    static DatiRiepilogoType fattBodyDatiRiep;
    static DettaglioLineeType fattBodyDettLin;
    static AltriDatiGestionaliType altriDatiGest;
    static CodiceArticoloType codArt;
    static ScontoMaggiorazioneType scontoMaggLin, scontoMaggDatiGen;
    static DatiGeneraliDocumentoType datiGenDoc;
    static DatiTrasportoType datiTrasp;
    static FatturaPrincipaleType fattPrinc;
    static DatiBolloType datiBollo;
    static DatiRitenutaType datiRitenuta;
    static DatiCassaPrevidenzialeType datiCassaPrev;
    static DatiAnagraficiVettoreType datiTraspDatiAnaVett;
    static DatiDocumentiCorrelatiType datiDocCorrContratto, datiDocCorrConv, datiDocCorrFattColl, datiDocCorrAcq, datiDocCorrRic;
    static DatiDDTType datiDDT;
    static DatiSALType datiSal;

    static Date date = new Date();
    private static final DateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    static int lvlCur, lvlPrev, line, retCod, nprg;
    static String lvlTmp, lvlarr[], rootVersione, sPrg;
    static List<String> prgList;
    static byte[] array;

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        xml = new ObjectFactory();
        prgList = new ArrayList<>();
        array = new byte[5];
        nprg = 0;

        try {
            jaxbContext = JAXBContext.newInstance("fatturaelettronica.ordinaria");
            marshaller = jaxbContext.createMarshaller();
        } catch (JAXBException e) {
            JOptionPane.showMessageDialog(null, "Riscontrata eccezione in JAXB:\n" + e.getMessage());
        }
        //marshaller.setSchema(schema);

        BufferedReader br;
        File fTemp;
        FileReader fr;
        fw = null;

        FileWriter fwe = null;
        JFileChooser jfc = new JFileChooser();
        JFrame jf = new JFrame("Conversione dati fatture in XML");
        JPanel jp = new JPanel();
        jp.setVisible(true);
        jf.getContentPane().add(jp, BorderLayout.CENTER);
        jf.setVisible(true);

        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setDialogTitle("Scegli file da convertire in XML");
        jfc.setDialogType(JFileChooser.OPEN_DIALOG);
        jfc.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jfc.setFileFilter(filter);
        jfc.setVisible(true);
        int fileIndex = 0;

        try {
            while (jfc.getSelectedFiles().length <= 0 || jfc.getSelectedFile() == null) {
                if (jfc.showOpenDialog(jf) == JFileChooser.CANCEL_OPTION) {
                    System.exit(1);
                }
                appdata = jfc.getCurrentDirectory().getAbsolutePath();
                if ("".equals(appdata) || appdata == null) {
                    System.out.println("env var not defined!");
                    return;
                }
                fTemp = new File(appdata + "\\ae_fatturaElettronica");
                if (!(fTemp.exists())) {
                    fTemp.mkdirs();
                }
                fTemp = new File(appdata + "\\ae_fatturaElettronica\\fattura_elettronica_err.log");
                if (!(fTemp.exists())) {
                    fTemp.createNewFile();
                }
                fwe = new FileWriter(fTemp);
                bwe = new BufferedWriter(fwe);

                //appdata = System.getenv("AppData");
                while (fileIndex < jfc.getSelectedFiles().length) {
                    bwe.write(SIMPLE_DATE_FORMAT.format(date) + " >   " + "inizio elaborazione file " + jfc.getSelectedFiles()[fileIndex].getName() + "\n");

                    line = 0;
                    lvlPrev = 0;
                    initializeVar();
                    fr = new FileReader(jfc.getSelectedFiles()[fileIndex]);
                    br = new BufferedReader(new InputStreamReader(new FileInputStream(jfc.getSelectedFiles()[fileIndex]), "Cp1252"));
                    String sCurrentLine = br.readLine();
                    while (sCurrentLine != null) {
                        line++;
                        bwe.write(SIMPLE_DATE_FORMAT.format(date) + " >   " + "init-tratt @line: " + line + "\n");
                        try {
                            retCod = getXml(sCurrentLine);
                        } catch (IOException | ParseException | JAXBException | DatatypeConfigurationException e) {
                            JOptionPane.showMessageDialog(jp, "Errore riga " + line + "\nValore riga: " + sCurrentLine + "\nEccezione sollevata: " + e.toString() + "\n", "Formato dato errato", JOptionPane.WARNING_MESSAGE);
                        }
                        switch (retCod) {
                            case 1:
                                break;
                            case 3:
                                bwe.write(SIMPLE_DATE_FORMAT.format(date) + " >   " + "errore tipo: " + retCod + " - parametri in index[] non presenti o più di 2 \n");
                                break;
                            default:
                                bwe.write(SIMPLE_DATE_FORMAT.format(date) + " >   " + "errore tipo: " + retCod + "\n");
                                break;
                        }
                        sCurrentLine = br.readLine();
                    }
                    buildFattBody();
                    writeFattura();
                    br.close();
                    fr.close();
                    if (fw != null) {
                        fw.close();
                    }
                    fileIndex++;
                }
            }
        } catch (HeadlessException | IOException | JAXBException e) {
            e.printStackTrace(new PrintWriter(bwe));
            JOptionPane.showMessageDialog(jp, "Riscontrata eccezione:\n" + e.getMessage());
        }
        try {
            if (bwe != null) {
                bwe.write(SIMPLE_DATE_FORMAT.format(date) + " >   righe lette: " + line);
                bwe.close();
            }
            if (fwe != null) {
                fwe.close();
            }
            if (JOptionPane.showConfirmDialog(jp, "Si desidera aprire la cartella dove sono stati prodotti i file?") == JOptionPane.YES_OPTION) {
                Runtime.getRuntime().exec("explorer.exe " + appdata + "\\ae_fatturaElettronica");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(jp, "Riscontrata eccezione di IO:\n" + ex.getMessage());
        }
        System.exit(1);
    }

    private static void initializeVar() {
        root = xml.createFatturaElettronicaType();
        fattHeader = xml.createFatturaElettronicaHeaderType();

        cedAnaAna = xml.createAnagraficaType();
        cedAnaIdFis = xml.createIdFiscaleType();
        cedAna = xml.createDatiAnagraficiCedenteType();
        cedContatti = xml.createContattiType();
        cedRea = xml.createIscrizioneREAType();
        cedSede = xml.createIndirizzoType();
        cedStab = xml.createIndirizzoType();
        ced = xml.createCedentePrestatoreType();

        cessAnaAna = xml.createAnagraficaType();
        cessAnaIdFis = xml.createIdFiscaleType();
        cessRapprFisIdFis = xml.createIdFiscaleType();
        cessAna = xml.createDatiAnagraficiCessionarioType();
        cessRapprFis = xml.createRappresentanteFiscaleCessionarioType();
        cessSede = xml.createIndirizzoType();
        cessStab = xml.createIndirizzoType();
        cess = xml.createCessionarioCommittenteType();
        contattiTrasm = xml.createContattiTrasmittenteType();
        idTrasm = xml.createIdFiscaleType();
        datiTrasm = xml.createDatiTrasmissioneType();

        rapprAnaAna = xml.createAnagraficaType();
        rapprAnaIdFis = xml.createIdFiscaleType();
        rapprAna = xml.createDatiAnagraficiRappresentanteType();
        headRapprFis = xml.createRappresentanteFiscaleType();
        terzoAnaAna = xml.createAnagraficaType();
        terzoAnaIdFis = xml.createIdFiscaleType();
        terzoAna = xml.createDatiAnagraficiTerzoIntermediarioType();
        terzo = xml.createTerzoIntermediarioSoggettoEmittenteType();

        fattBodyDatiVeicoli = xml.createDatiVeicoliType();
        fattBodyDatiGen = xml.createDatiGeneraliType();
        fattBody = xml.createFatturaElettronicaBodyType();
        fattPrinc = xml.createFatturaPrincipaleType();
        datiTrasp = xml.createDatiTrasportoType();
        datiTraspInd = xml.createIndirizzoType();
        datiTraspDatiAnaVett = xml.createDatiAnagraficiVettoreType();
        datiTraspAnaIdFis = xml.createIdFiscaleType();
        datiTraspAnaAna = xml.createAnagraficaType();
        datiGenDoc = xml.createDatiGeneraliDocumentoType();
        datiRitenuta = xml.createDatiRitenutaType();
        datiBollo = xml.createDatiBolloType();
        fattBodyDatiBeniSrv = xml.createDatiBeniServiziType();
        datiDocCorrAcq = xml.createDatiDocumentiCorrelatiType();
        datiDocCorrContratto = xml.createDatiDocumentiCorrelatiType();
        datiDocCorrConv = xml.createDatiDocumentiCorrelatiType();
        datiDocCorrRic = xml.createDatiDocumentiCorrelatiType();
        datiDocCorrFattColl = xml.createDatiDocumentiCorrelatiType();
        datiDDT = xml.createDatiDDTType();
        datiCassaPrev = xml.createDatiCassaPrevidenzialeType();
        scontoMaggDatiGen = xml.createScontoMaggiorazioneType();
        fattBodyDettLin = xml.createDettaglioLineeType();
        codArt = xml.createCodiceArticoloType();
        scontoMaggLin = xml.createScontoMaggiorazioneType();
        altriDatiGest = xml.createAltriDatiGestionaliType();
        fattBodyDatiRiep = xml.createDatiRiepilogoType();
        fattBodyDatiPag = xml.createDatiPagamentoType();
        fattBodyDettPag = xml.createDettaglioPagamentoType();
        fattBodyAllegato = xml.createAllegatiType();
    }

    private static int getXml(String s) throws JAXBException, FileNotFoundException, ParseException, DatatypeConfigurationException, IOException {
        String[] index;
        DecimalFormat df = new DecimalFormat("######0.00");

        index = s.split(";");
        index[0] = index[0].replaceAll("\\s+", "");
        /*if (index.length > 1) {
            index[1] = index[1].replaceAll("[^a-zA-Z0-9- ]+", "");
        }*/
        if (index.length != 2) {
            return 3;
        } else {
            lvlarr = index[0].split("\\.");
            if (lvlarr.length < 3) {
                lvlTmp = index[0];
            } else if (lvlarr.length == 3) {
                if (Integer.parseInt(lvlarr[2]) <= 9) {
                    lvlTmp = index[0].substring(0, 4) + '0' + index[0].substring(4, index[0].length());
                }
            } else if (Integer.parseInt(lvlarr[2]) <= 9 && Integer.parseInt(lvlarr[3]) <= 9) {
                lvlTmp = index[0].substring(0, 4) + '0' + index[0].substring(4, 6) + '0' + index[0].substring(6, index[0].length());
            } else if (Integer.parseInt(lvlarr[2]) <= 9 && Integer.parseInt(lvlarr[3]) > 9) {
                lvlTmp = index[0].substring(0, 4) + '0' + index[0].substring(4, index[0].length());
            } else if (Integer.parseInt(lvlarr[2]) > 9 && Integer.parseInt(lvlarr[3]) <= 9) {
                lvlTmp = index[0].substring(0, 6) + '0' + index[0].substring(6, index[0].length());
            }
            lvlCur = cntlLvl(lvlTmp.replace(".", "").replace(",", ""));
            if (lvlPrev >= lvlCur) {
                if (lvlCur > 10000000 && lvlCur < 20000000) {
                    buildFattBody();
                    writeFattura();
                    initializeVar();
                } else if (lvlCur > 20000000 && lvlCur < 21010700) {
                    buildFattBody();
                } else if (lvlCur > 21010700 && lvlCur < 21010800) {
                    buildDatiCassaPrev();
                } else if (lvlCur > 21010800 && lvlCur < 21010900) {
                    buildScontoMaggGen();
                } else if (lvlCur > 21020000 && lvlCur < 21030000 && lvlPrev != lvlCur) {
                    buildDatiOrdineAcquisto();
                } else if (lvlCur > 21030000 && lvlCur < 21040000 && lvlPrev != lvlCur) {
                    buildDatiContratto();
                } else if (lvlCur > 21040000 && lvlCur < 21050000 && lvlPrev != lvlCur) {
                    buildDatiConvenzione();
                } else if (lvlCur > 21050000 && lvlCur < 21060000 && lvlPrev != lvlCur) {
                    buildDatiRicezione();
                } else if (lvlCur > 21060000 && lvlCur < 21070000 && lvlPrev != lvlCur) {
                    buildDatiFattureCollegate();
                } else if (lvlCur > 21080000 && lvlCur < 21090000 && lvlPrev != lvlCur) {
                    buildDatiDDT();
                } else if (lvlCur > 22010000 && lvlCur < 22010300) {
                    buildDettaglioLinee();
                } else if (lvlCur >= 22010300 && lvlCur < 22010400) {
                    buildCodiceArticolo();
                } else if (lvlCur > 22011000 && lvlCur < 22011100) {
                    buildScontoMaggLin();
                } else if (lvlCur > 22011600 && lvlCur < 22020000) {
                    buildAltriDatiGestionali();
                } else if (lvlCur > 22020000 && lvlCur < 23000000) {
                    buildDatiRiepilogo();
                } else if (lvlCur > 24000000 && lvlCur < 24020000) {
                    buildDatiPagamento();
                } else if (lvlCur > 24020000 && lvlCur < 25000000) {
                    buildDettaglioPagamento();
                } else if (lvlCur > 25000000 && lvlCur < 25059999) {
                    buildAllegato();
                } else {
                    bwe.write(SIMPLE_DATE_FORMAT.format(date) + " >   lvlCur: " + lvlCur + " lvlPrev: " + lvlPrev + "\n");
                    return 8;
                }
            } else if (lvlPrev > 10000000 && lvlPrev < 20000000 && lvlCur >= 20000000) {
                buildFattHeader();
            }

            switch (index[0]) {
                case "1.1.1.1":
                    idTrasm.setIdPaese(index[1]);
                    break;
                case "1.1.1.2":
                    cf = index[1];
                    idTrasm.setIdCodice(index[1]);
                    break;
                case "1.1.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9]", "");
                    if (index[1].length() > 5) {
                        index[1] = index[1].substring(0, 5);
                    }

                    sPrg = index[1];
                    while (prgList.contains(sPrg)) {
                        sPrg = RandomStringUtils.random(5, true, true);
                    }

                    prgList.add(sPrg);
                    datiTrasm.setProgressivoInvio(sPrg);
                    break;
                case "1.1.3":
                    rootVersione = index[1];
                    datiTrasm.setFormatoTrasmissione(FormatoTrasmissioneType.fromValue(index[1]));
                    break;
                case "1.1.4":
                    datiTrasm.setCodiceDestinatario(index[1]);
                    break;
                case "1.1.5.1":
                    contattiTrasm.setTelefono(index[1].replaceAll(" ", ""));
                    break;
                case "1.1.5.2":
                    contattiTrasm.setEmail(index[1]);
                    break;
                case "1.1.6":
                    datiTrasm.setPECDestinatario(index[1]);
                    break;
                case "1.2.1.1.1":
                    cedAnaIdFis.setIdPaese(index[1]);
                    break;
                case "1.2.1.1.2":
                    cedAnaIdFis.setIdCodice(index[1]);
                    break;
                case "1.2.1.2":
                    cedAna.setCodiceFiscale(index[1]);
                    break;
                case "1.2.1.3.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedAnaAna.setDenominazione(index[1]);
                    break;
                case "1.2.1.3.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedAnaAna.setNome(index[1]);
                    break;
                case "1.2.1.3.3":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedAnaAna.setCognome(index[1]);
                    break;
                case "1.2.1.3.4":
                    cedAnaAna.setTitolo(index[1]);
                    break;
                case "1.2.1.3.5":
                    cedAnaAna.setCodEORI(index[1]);
                    break;
                case "1.2.1.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedAna.setAlboProfessionale(index[1]);
                    break;
                case "1.2.1.5":
                    cedAna.setProvinciaAlbo(index[1]);
                    break;
                case "1.2.1.6":
                    cedAna.setNumeroIscrizioneAlbo(index[1]);
                    break;
                case "1.2.1.7":
                    cedAna.setDataIscrizioneAlbo(getXMLGregorianCalendar(index[1]));
                    break;
                case "1.2.1.8":
                    cedAna.setRegimeFiscale(RegimeFiscaleType.fromValue(index[1]));
                    break;
                case "1.2.2.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedSede.setIndirizzo(index[1]);
                    break;
                case "1.2.2.2":
                    cedSede.setNumeroCivico(index[1]);
                    break;
                case "1.2.2.3":
                    cedSede.setCAP(index[1]);
                    break;
                case "1.2.2.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedSede.setComune(index[1]);
                    break;
                case "1.2.2.5":
                    cedSede.setProvincia(index[1]);
                    break;
                case "1.2.2.6":
                    cedSede.setNazione(index[1]);
                    break;
                case "1.2.3.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedStab.setIndirizzo(index[1]);
                    break;
                case "1.2.3.2":
                    cedStab.setNumeroCivico(index[1]);
                    break;
                case "1.2.3.3":
                    cedStab.setCAP(index[1]);
                    break;
                case "1.2.3.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cedStab.setComune(index[1]);
                    break;
                case "1.2.3.5":
                    cedStab.setProvincia(index[1]);
                    break;
                case "1.2.3.6":
                    cedStab.setNazione(index[1]);
                    break;
                case "1.2.4.1":
                    cedRea.setUfficio(index[1]);
                    break;
                case "1.2.4.2":
                    cedRea.setNumeroREA(index[1]);
                    break;
                case "1.2.4.3":
                    index[1] = index[1].replaceAll(",", ".");
                    cedRea.setCapitaleSociale(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "1.2.4.4":
                    cedRea.setSocioUnico(SocioUnicoType.fromValue(index[1]));
                    break;
                case "1.2.4.5":
                    cedRea.setStatoLiquidazione(StatoLiquidazioneType.fromValue(index[1]));
                    break;
                case "1.2.5.1":
                    cedContatti.setTelefono(index[1].replaceAll(" ", ""));
                    break;
                case "1.2.5.2":
                    cedContatti.setFax(index[1]);
                    break;
                case "1.2.5.3":
                    cedContatti.setEmail(index[1]);
                    break;
                case "1.2.6":
                    ced.setRiferimentoAmministrazione(index[1]);
                    break;
                case "1.3.1.1.1":
                    rapprAnaIdFis.setIdPaese(index[1]);
                    break;
                case "1.3.1.1.2":
                    rapprAnaIdFis.setIdCodice(index[1]);
                    break;
                case "1.3.1.2":
                    rapprAna.setCodiceFiscale(index[1]);
                    break;
                case "1.3.1.3.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    rapprAnaAna.setDenominazione(index[1]);
                    break;
                case "1.3.1.3.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    rapprAnaAna.setNome(index[1]);
                    break;
                case "1.3.1.3.3":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    rapprAnaAna.setCognome(index[1]);
                    break;
                case "1.3.1.3.4":
                    rapprAnaAna.setTitolo(index[1]);
                    break;
                case "1.3.1.3.5":
                    rapprAnaAna.setCodEORI(index[1]);
                    break;
                case "1.4.1.1.1":
                    cessAnaIdFis.setIdPaese(index[1]);
                    break;
                case "1.4.1.1.2":
                    cessAnaIdFis.setIdCodice(index[1]);
                    break;
                case "1.4.1.2":
                    cessAna.setCodiceFiscale(index[1]);
                    break;
                case "1.4.1.3.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessAnaAna.setDenominazione(index[1]);
                    break;
                case "1.4.1.3.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessAnaAna.setNome(index[1]);
                    break;
                case "1.4.1.3.3":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessAnaAna.setCognome(index[1]);
                    break;
                case "1.4.1.3.4":
                    cessAnaAna.setTitolo(index[1]);
                    break;
                case "1.4.1.3.5":
                    cessAnaAna.setCodEORI(index[1]);
                    break;
                case "1.4.2.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessSede.setIndirizzo(index[1]);
                    break;
                case "1.4.2.2":
                    cessSede.setNumeroCivico(index[1]);
                    break;
                case "1.4.2.3":
                    cessSede.setCAP(index[1]);
                    break;
                case "1.4.2.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessSede.setComune(index[1]);
                    break;
                case "1.4.2.5":
                    cessSede.setProvincia(index[1]);
                    break;
                case "1.4.2.6":
                    cessSede.setNazione(index[1]);
                    break;
                case "1.4.3.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessStab.setIndirizzo(index[1]);
                    break;
                case "1.4.3.2":
                    cessStab.setNumeroCivico(index[1]);
                    break;
                case "1.4.3.3":
                    cessStab.setCAP(index[1]);
                    break;
                case "1.4.3.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessStab.setComune(index[1]);
                    break;
                case "1.4.3.5":
                    cessStab.setProvincia(index[1]);
                    break;
                case "1.4.3.6":
                    cessStab.setNazione(index[1]);
                    break;
                case "1.4.4.1.1":
                    cessRapprFisIdFis.setIdPaese(index[1]);
                    break;
                case "1.4.4.1.2":
                    cessRapprFisIdFis.setIdCodice(index[1]);
                    break;
                case "1.4.4.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessRapprFis.setDenominazione(index[1]);
                    break;
                case "1.4.4.3":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessRapprFis.setNome(index[1]);
                    break;
                case "1.4.4.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    cessRapprFis.setCognome(index[1]);
                    break;
                case "1.5.1.1.1":
                    terzoAnaIdFis.setIdPaese(index[1]);
                    break;
                case "1.5.1.1.2":
                    terzoAnaIdFis.setIdCodice(index[1]);
                    break;
                case "1.5.1.2":
                    terzoAna.setCodiceFiscale(index[1]);
                    break;
                case "1.5.1.3.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    terzoAnaAna.setDenominazione(index[1]);
                    break;
                case "1.5.1.3.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    terzoAnaAna.setNome(index[1]);
                    break;
                case "1.5.1.3.3":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    terzoAnaAna.setCognome(index[1]);
                    break;
                case "1.5.1.3.4":
                    terzoAnaAna.setTitolo(index[1]);
                    break;
                case "1.5.1.3.5":
                    terzoAnaAna.setCodEORI(index[1]);
                    break;
                case "1.6":
                    fattHeader.setSoggettoEmittente(SoggettoEmittenteType.fromValue(index[1]));
                    break;
                case "2.1.1.1":
                    datiGenDoc.setTipoDocumento(TipoDocumentoType.fromValue(index[1]));
                    break;
                case "2.1.1.2":
                    datiGenDoc.setDivisa(index[1].replaceAll(" ", ""));
                    break;
                case "2.1.1.3":
                    datiGenDoc.setData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.1.4":
                    datiGenDoc.setNumero(index[1]);
                    break;
                case "2.1.1.5.1":
                    datiRitenuta.setTipoRitenuta(TipoRitenutaType.fromValue(index[1]));
                    break;
                case "2.1.1.5.2":
                    index[1] = index[1].replaceAll(",", ".");
                    datiRitenuta.setImportoRitenuta(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.5.3":
                    index[1] = index[1].replaceAll(",", ".");
                    datiRitenuta.setAliquotaRitenuta(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.5.4":
                    datiRitenuta.setCausalePagamento(CausalePagamentoType.fromValue(index[1]));
                    break;
                case "2.1.1.6.1":
                    if (index[1].equalsIgnoreCase("S")) {
                        index[1] = "SI";
                    } else if (index[1].equalsIgnoreCase("N")) {
                        index[1] = "NO";
                    }
                    datiBollo.setBolloVirtuale(BolloVirtualeType.fromValue(index[1]));
                    break;
                case "2.1.1.6.2":
                    index[1] = index[1].replaceAll(",", ".");
                    datiBollo.setImportoBollo(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.7.1":
                    datiCassaPrev.setTipoCassa(TipoCassaType.fromValue(index[1]));
                    break;
                case "2.1.1.7.2":
                    index[1] = index[1].replaceAll(",", ".");
                    datiCassaPrev.setAlCassa(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.7.3":
                    index[1] = index[1].replaceAll(",", ".");
                    datiCassaPrev.setImportoContributoCassa(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.7.4":
                    index[1] = index[1].replaceAll(",", ".");
                    datiCassaPrev.setImponibileCassa(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.7.5":
                    index[1] = index[1].replaceAll(",", ".");
                    datiCassaPrev.setAliquotaIVA(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.7.6":
                    datiCassaPrev.setRitenuta(RitenutaType.fromValue(index[1]));
                    break;
                case "2.1.1.7.7":
                    datiCassaPrev.setNatura(NaturaType.fromValue(index[1]));
                    break;
                case "2.1.1.7.8":
                    datiCassaPrev.setRiferimentoAmministrazione(index[1]);
                    break;
                case "2.1.1.8.1":
                    scontoMaggDatiGen.setTipo(TipoScontoMaggiorazioneType.fromValue(index[1]));
                    break;
                case "2.1.1.8.2":
                    index[1] = index[1].replaceAll(",", ".");
                    scontoMaggDatiGen.setPercentuale(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.8.3":
                    index[1] = index[1].replaceAll(",", ".");
                    scontoMaggDatiGen.setImporto(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.9":
                    index[1] = index[1].replaceAll(",", ".");
                    datiGenDoc.setImportoTotaleDocumento(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.10":
                    index[1] = index[1].replaceAll(",", ".");
                    datiGenDoc.setArrotondamento(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.1.11":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiGenDoc.getCausale().add(index[1]);
                    break;
                case "2.1.1.12":
                    datiGenDoc.setArt73(Art73Type.fromValue(index[1]));
                    break;
                case "2.1.2.1":
                    datiDocCorrAcq.getRiferimentoNumeroLinea().add(Integer.parseInt(index[1]));
                    break;
                case "2.1.2.2":
                    datiDocCorrAcq.setIdDocumento(index[1]);
                    break;
                case "2.1.2.3":
                    datiDocCorrAcq.setData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.2.4":
                    datiDocCorrAcq.setNumItem(index[1]);
                    break;
                case "2.1.2.5":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiDocCorrAcq.setCodiceCommessaConvenzione(index[1]);
                    break;
                case "2.1.2.6":
                    datiDocCorrAcq.setCodiceCUP(index[1]);
                    break;
                case "2.1.2.7":
                    datiDocCorrAcq.setCodiceCIG(index[1]);
                    break;
                case "2.1.3.1":
                    datiDocCorrContratto.getRiferimentoNumeroLinea().add(Integer.parseInt(index[1]));
                    break;
                case "2.1.3.2":
                    datiDocCorrContratto.setIdDocumento(index[1]);
                    break;
                case "2.1.3.3":
                    datiDocCorrContratto.setData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.3.4":
                    datiDocCorrContratto.setNumItem(index[1]);
                    break;
                case "2.1.3.5":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiDocCorrContratto.setCodiceCommessaConvenzione(index[1]);
                    break;
                case "2.1.3.6":
                    datiDocCorrContratto.setCodiceCUP(index[1]);
                    break;
                case "2.1.3.7":
                    datiDocCorrContratto.setCodiceCIG(index[1]);
                    break;
                case "2.1.4.1":
                    datiDocCorrConv.getRiferimentoNumeroLinea().add(Integer.parseInt(index[1]));
                    break;
                case "2.1.4.2":
                    datiDocCorrConv.setIdDocumento(index[1]);
                    break;
                case "2.1.4.3":
                    datiDocCorrConv.setData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.4.4":
                    datiDocCorrConv.setNumItem(index[1]);
                    break;
                case "2.1.4.5":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiDocCorrConv.setCodiceCommessaConvenzione(index[1]);
                    break;
                case "2.1.4.6":
                    datiDocCorrConv.setCodiceCUP(index[1]);
                    break;
                case "2.1.4.7":
                    datiDocCorrConv.setCodiceCIG(index[1]);
                    break;
                case "2.1.5.1":
                    datiDocCorrRic.getRiferimentoNumeroLinea().add(Integer.parseInt(index[1]));
                    break;
                case "2.1.5.2":
                    datiDocCorrRic.setIdDocumento(index[1]);
                    break;
                case "2.1.5.3":
                    datiDocCorrRic.setData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.5.4":
                    datiDocCorrRic.setNumItem(index[1]);
                    break;
                case "2.1.5.5":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiDocCorrRic.setCodiceCommessaConvenzione(index[1]);
                    break;
                case "2.1.5.6":
                    datiDocCorrRic.setCodiceCUP(index[1]);
                    break;
                case "2.1.5.7":
                    datiDocCorrRic.setCodiceCIG(index[1]);
                    break;
                case "2.1.6.1":
                    datiDocCorrFattColl.getRiferimentoNumeroLinea().add(Integer.parseInt(index[1]));
                    break;
                case "2.1.6.2":
                    datiDocCorrFattColl.setIdDocumento(index[1]);
                    break;
                case "2.1.6.3":
                    datiDocCorrFattColl.setData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.6.4":
                    datiDocCorrFattColl.setNumItem(index[1]);
                    break;
                case "2.1.6.5":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiDocCorrFattColl.setCodiceCommessaConvenzione(index[1]);
                    break;
                case "2.1.6.6":
                    datiDocCorrFattColl.setCodiceCUP(index[1]);
                    break;
                case "2.1.6.7":
                    datiDocCorrFattColl.setCodiceCIG(index[1]);
                    break;
                case "2.1.7.1":
                    datiSal.setRiferimentoFase(Integer.parseInt(index[1]));
                    fattBodyDatiGen.getDatiSAL().add(datiSal);
                    datiSal = xml.createDatiSALType();
                    break;
                case "2.1.8.1":
                    datiDDT.setNumeroDDT(index[1]);
                    break;
                case "2.1.8.2":
                    datiDDT.setDataDDT(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.8.3":
                    datiDDT.getRiferimentoNumeroLinea().add(Integer.parseInt(index[1]));
                    break;
                case "2.1.9.1.1.1":
                    datiTraspAnaIdFis.setIdPaese(index[1]);
                    break;
                case "2.1.9.1.1.2":
                    datiTraspAnaIdFis.setIdCodice(index[1]);
                    break;
                case "2.1.9.1.2":
                    datiTraspDatiAnaVett.setCodiceFiscale(index[1]);
                    break;
                case "2.1.9.1.3.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTraspAnaAna.setDenominazione(index[1]);
                    break;
                case "2.1.9.1.3.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTraspAnaAna.setNome(index[1]);
                    break;
                case "2.1.9.1.3.3":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTraspAnaAna.setCognome(index[1]);
                    break;
                case "2.1.9.1.3.4":
                    datiTraspAnaAna.setTitolo(index[1]);
                    break;
                case "2.1.9.1.3.5":
                    datiTraspAnaAna.setCodEORI(index[1]);
                    break;
                case "2.1.9.1.4":
                    datiTraspDatiAnaVett.setNumeroLicenzaGuida(index[1]);
                    break;
                case "2.1.9.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTrasp.setMezzoTrasporto(index[1]);
                    break;
                case "2.1.9.3":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTrasp.setCausaleTrasporto(index[1]);
                    break;
                case "2.1.9.4":
                    datiTrasp.setNumeroColli(Integer.parseInt(index[1]));
                    break;
                case "2.1.9.5":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTrasp.setDescrizione(index[1]);
                    break;
                case "2.1.9.6":
                    datiTrasp.setUnitaMisuraPeso(index[1]);
                    break;
                case "2.1.9.7":
                    index[1] = index[1].replaceAll(",", ".");
                    datiTrasp.setPesoLordo(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.9.8":
                    index[1] = index[1].replaceAll(",", ".");
                    datiTrasp.setPesoNetto(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.1.9.9":
                    datiTrasp.setDataOraRitiro(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.9.10":
                    datiTrasp.setDataInizioTrasporto(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.9.11":
                    datiTrasp.setTipoResa(index[1]);
                    break;
                case "2.1.9.12.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTraspInd.setIndirizzo(index[1]);
                    break;
                case "2.1.9.12.2":
                    datiTraspInd.setNumeroCivico(index[1]);
                    break;
                case "2.1.9.12.3":
                    datiTraspInd.setCAP(index[1]);
                    break;
                case "2.1.9.12.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    datiTraspInd.setComune(index[1]);
                    break;
                case "2.1.9.12.5":
                    datiTraspInd.setProvincia(index[1]);
                    break;
                case "2.1.9.12.6":
                    datiTraspInd.setNazione(index[1]);
                    break;
                case "2.1.9.13":
                    datiTrasp.setDataOraConsegna(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.1.10.1":
                    fattPrinc.setNumeroFatturaPrincipale(index[1]);
                    break;
                case "2.1.10.2":
                    fattPrinc.setDataFatturaPrincipale(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.2.1.1":
                    fattBodyDettLin.setNumeroLinea(Integer.parseInt(index[1]));
                    break;
                case "2.2.1.2":
                    fattBodyDettLin.setTipoCessionePrestazione(TipoCessionePrestazioneType.fromValue(index[1]));
                    break;
                case "2.2.1.3.1":
                    codArt.setCodiceTipo(index[1]);
                    break;
                case "2.2.1.3.2":
                    codArt.setCodiceValore(index[1]);
                    break;
                case "2.2.1.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyDettLin.setDescrizione(index[1]);
                    break;
                case "2.2.1.5":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDettLin.setQuantita(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.1.6":
                    fattBodyDettLin.setUnitaMisura(index[1]);
                    break;
                case "2.2.1.7":
                    fattBodyDettLin.setDataInizioPeriodo(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.2.1.8":
                    fattBodyDettLin.setDataFinePeriodo(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.2.1.9":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDettLin.setPrezzoUnitario(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.1.10.1":
                    scontoMaggLin.setTipo(TipoScontoMaggiorazioneType.fromValue(index[1]));
                    break;
                case "2.2.1.10.2":
                    index[1] = index[1].replaceAll(",", ".");
                    scontoMaggLin.setPercentuale(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.1.10.3":
                    index[1] = index[1].replaceAll(",", ".");
                    scontoMaggLin.setImporto(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.1.11":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDettLin.setPrezzoTotale(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.1.12":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDettLin.setAliquotaIVA(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.1.13":
                    fattBodyDettLin.setRitenuta(RitenutaType.fromValue(index[1]));
                    break;
                case "2.2.1.14":
                    fattBodyDettLin.setNatura(NaturaType.fromValue(index[1]));
                    break;
                case "2.2.1.15":
                    fattBodyDettLin.setRiferimentoAmministrazione(index[1]);
                    break;
                case "2.2.1.16.1":
                    altriDatiGest.setTipoDato(index[1]);
                    break;
                case "2.2.1.16.2":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    altriDatiGest.setRiferimentoTesto(index[1]);
                    break;
                case "2.2.1.16.3":
                    index[1] = index[1].replaceAll(",", ".");
                    altriDatiGest.setRiferimentoNumero(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.1.16.4":
                    altriDatiGest.setRiferimentoData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.2.2.1":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDatiRiep.setAliquotaIVA(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.2.2":
                    fattBodyDatiRiep.setNatura(NaturaType.fromValue(index[1]));
                    break;
                case "2.2.2.3":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDatiRiep.setSpeseAccessorie(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.2.4":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDatiRiep.setArrotondamento(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.2.5":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDatiRiep.setImponibileImporto(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.2.6":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDatiRiep.setImposta(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.2.2.7":
                    fattBodyDatiRiep.setEsigibilitaIVA(EsigibilitaIVAType.fromValue(index[1]));
                    break;
                case "2.2.2.8":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyDatiRiep.setRiferimentoNormativo(index[1]);
                    break;
                case "2.3.1":
                    fattBodyDatiVeicoli.setData(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.3.2":
                    fattBodyDatiVeicoli.setTotalePercorso(index[1]);
                    break;
                case "2.4.1":
                    fattBodyDatiPag.setCondizioniPagamento(CondizioniPagamentoType.fromValue(index[1]));
                    break;
                case "2.4.2.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyDettPag.setBeneficiario(index[1]);
                    break;
                case "2.4.2.2":
                    fattBodyDettPag.setModalitaPagamento(ModalitaPagamentoType.fromValue(index[1]));
                    break;
                case "2.4.2.3":
                    fattBodyDettPag.setDataRiferimentoTerminiPagamento(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.4.2.4":
                    fattBodyDettPag.setGiorniTerminiPagamento(Integer.parseInt(index[1]));
                    break;
                case "2.4.2.5":
                    fattBodyDettPag.setDataScadenzaPagamento(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.4.2.6":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDettPag.setImportoPagamento(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.4.2.7":
                    fattBodyDettPag.setCodUfficioPostale(index[1]);
                    break;
                case "2.4.2.8":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyDettPag.setCognomeQuietanzante(index[1]);
                    break;
                case "2.4.2.9":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyDettPag.setNomeQuietanzante(index[1]);
                    break;
                case "2.4.2.10":
                    fattBodyDettPag.setCFQuietanzante(index[1]);
                    break;
                case "2.4.2.11":
                    fattBodyDettPag.setTitoloQuietanzante(index[1]);
                    break;
                case "2.4.2.12":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyDettPag.setIstitutoFinanziario(index[1]);
                    break;
                case "2.4.2.13":
                    fattBodyDettPag.setIBAN(index[1].replaceAll(" ", ""));
                    break;
                case "2.4.2.14":
                    fattBodyDettPag.setABI(index[1]);
                    break;
                case "2.4.2.15":
                    fattBodyDettPag.setCAB(index[1]);
                    break;
                case "2.4.2.16":
                    fattBodyDettPag.setBIC(index[1]);
                    break;
                case "2.4.2.17":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDettPag.setScontoPagamentoAnticipato(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.4.2.18":
                    fattBodyDettPag.setDataLimitePagamentoAnticipato(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.4.2.19":
                    index[1] = index[1].replaceAll(",", ".");
                    fattBodyDettPag.setPenalitaPagamentiRitardati(new BigDecimal(("0".equals(index[1]) ? "0.00" : index[1])));
                    break;
                case "2.4.2.20":
                    fattBodyDettPag.setDataDecorrenzaPenale(getXMLGregorianCalendar(index[1]));
                    break;
                case "2.4.2.21":
                    fattBodyDettPag.setCodicePagamento(index[1]);
                    break;
                case "2.5.1":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyAllegato.setNomeAttachment(index[1]);
                    break;
                case "2.5.2":
                    fattBodyAllegato.setAlgoritmoCompressione(index[1]);
                    break;
                case "2.5.3":
                    fattBodyAllegato.setFormatoAttachment(index[1]);
                    break;
                case "2.5.4":
                    index[1] = index[1].replaceAll("[^a-zA-Z0-9-. ]+", "");
                    fattBodyAllegato.setDescrizioneAttachment(index[1]);
                    break;
                case "2.5.5":
                    //fattBodyAllegato.setAttachment(IOUtils Apache);
                    break;
            }
            lvlPrev = lvlCur;
        }
        return 1;
    }

    private static int cntlLvl(String s) {
        if (s.length() < 8) {
            s += "0";
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(cntlLvl(s));
            s = sb.toString();
        }
        return Integer.parseInt(s);
    }

    private static XMLGregorianCalendar getXMLGregorianCalendar(String date) throws ParseException, DatatypeConfigurationException {
        Date dob;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        date = date.replaceAll("\\.", "-");
        dob = df.parse(date);
        GregorianCalendar cal = new GregorianCalendar();

        cal.setTime(dob);
        XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        xmlDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        return xmlDate;
    }

    private static void writeFattura() throws IOException, JAXBException {
        nprg += 1;
        root.setFatturaElettronicaHeader(fattHeader);
        //se servirà aprire un dialogo per scegliere la versione
        root.setVersione(FormatoTrasmissioneType.fromValue(rootVersione));
        fw = new FileWriter(appdata + "\\ae_fatturaElettronica\\IT" + cf.trim() + "_" + sPrg + ".xml");
        marshaller.marshal(root, fw);
        root = xml.createFatturaElettronicaType();
    }

    private static void buildFattBody() {
        buildDatiCassaPrev();
        buildScontoMaggGen();
        buildDatiDDT();
        buildDatiFattureCollegate();
        buildDatiOrdineAcquisto();
        buildDatiContratto();
        buildDatiConvenzione();
        buildDatiRicezione();
        buildDatiRiepilogo();
        buildDettaglioLinee();
        buildDatiPagamento();
        buildAllegato();

        if (datiBollo.getBolloVirtuale() == BolloVirtualeType.SI) {
            datiGenDoc.setDatiBollo(datiBollo);
        }
        if (datiRitenuta.getTipoRitenuta() == TipoRitenutaType.RT_01 || datiRitenuta.getTipoRitenuta() == TipoRitenutaType.RT_02) {
            datiGenDoc.getDatiRitenuta().add(datiRitenuta);
        }

        if ((!("".equals(datiTraspAnaAna.getDenominazione()) || datiTraspAnaAna.getDenominazione() == null)) || (!("".equals(datiTraspAnaAna.getNome()) || datiTraspAnaAna.getNome() == null))) {
            datiTraspDatiAnaVett.setAnagrafica(datiTraspAnaAna);
        }
        if (!("".equals(datiTraspAnaIdFis.getIdPaese()) || datiTraspAnaIdFis.getIdPaese() == null)) {
            datiTraspDatiAnaVett.setIdFiscaleIVA(datiTraspAnaIdFis);
        }
        if (datiTraspDatiAnaVett.getAnagrafica() != null || (datiTraspDatiAnaVett.getCodiceFiscale() != null && !"".equals(datiTraspDatiAnaVett.getCodiceFiscale())) || datiTraspDatiAnaVett.getIdFiscaleIVA() != null) {
            datiTrasp.setDatiAnagraficiVettore(datiTraspDatiAnaVett);
        }
        if (!("".equals(datiTraspInd.getIndirizzo()) || datiTraspInd.getIndirizzo() == null)) {
            datiTrasp.setIndirizzoResa(datiTraspInd);
        }

        fattBodyDatiGen.setDatiGeneraliDocumento(datiGenDoc);
        fattBodyDatiGen.setDatiTrasporto(datiTrasp);
        if (!"".equals(fattPrinc.getNumeroFatturaPrincipale()) && fattPrinc.getNumeroFatturaPrincipale() != null) {
            fattBodyDatiGen.setFatturaPrincipale(fattPrinc);
        }

        fattBody.setDatiGenerali(fattBodyDatiGen);
        if (fattBodyDatiVeicoli.getData() != null) {
            fattBody.setDatiVeicoli(fattBodyDatiVeicoli);
        }
        fattBody.setDatiBeniServizi(fattBodyDatiBeniSrv);
        root.getFatturaElettronicaBody().add(fattBody);

        fattBodyDatiVeicoli = xml.createDatiVeicoliType();
        fattBodyDatiGen = xml.createDatiGeneraliType();
        fattBody = xml.createFatturaElettronicaBodyType();
        fattPrinc = xml.createFatturaPrincipaleType();
        datiTrasp = xml.createDatiTrasportoType();
        datiTraspInd = xml.createIndirizzoType();
        datiTraspDatiAnaVett = xml.createDatiAnagraficiVettoreType();
        datiTraspAnaIdFis = xml.createIdFiscaleType();
        datiTraspAnaAna = xml.createAnagraficaType();
        datiGenDoc = xml.createDatiGeneraliDocumentoType();
        datiRitenuta = xml.createDatiRitenutaType();
        datiBollo = xml.createDatiBolloType();
        fattBodyDatiBeniSrv = xml.createDatiBeniServiziType();
    }

    private static void buildDatiOrdineAcquisto() {
        if ((!(datiDocCorrAcq.getRiferimentoNumeroLinea().isEmpty())) || (!("".equals(datiDocCorrAcq.getIdDocumento()) || datiDocCorrAcq.getIdDocumento() == null))) {
            fattBodyDatiGen.getDatiOrdineAcquisto().add(datiDocCorrAcq);
        }

        datiDocCorrAcq = xml.createDatiDocumentiCorrelatiType();
    }

    private static void buildDatiContratto() {
        if ((!(datiDocCorrContratto.getRiferimentoNumeroLinea().isEmpty())) || (!("".equals(datiDocCorrContratto.getIdDocumento()) || datiDocCorrContratto.getIdDocumento() == null))) {
            fattBodyDatiGen.getDatiContratto().add(datiDocCorrContratto);
        }

        datiDocCorrContratto = xml.createDatiDocumentiCorrelatiType();
    }

    private static void buildDatiConvenzione() {
        if ((!(datiDocCorrConv.getRiferimentoNumeroLinea().isEmpty())) || (!("".equals(datiDocCorrConv.getIdDocumento()) || datiDocCorrConv.getIdDocumento() == null))) {
            fattBodyDatiGen.getDatiConvenzione().add(datiDocCorrConv);
        }

        datiDocCorrConv = xml.createDatiDocumentiCorrelatiType();
    }

    private static void buildDatiRicezione() {
        if ((!(datiDocCorrRic.getRiferimentoNumeroLinea().isEmpty())) || (!("".equals(datiDocCorrRic.getIdDocumento()) || datiDocCorrRic.getIdDocumento() == null))) {
            fattBodyDatiGen.getDatiRicezione().add(datiDocCorrRic);
        }

        datiDocCorrRic = xml.createDatiDocumentiCorrelatiType();
    }

    private static void buildDatiFattureCollegate() {
        if ((!(datiDocCorrFattColl.getRiferimentoNumeroLinea().isEmpty())) || (!("".equals(datiDocCorrFattColl.getIdDocumento()) || datiDocCorrFattColl.getIdDocumento() == null))) {
            fattBodyDatiGen.getDatiRicezione().add(datiDocCorrFattColl);
        }

        datiDocCorrFattColl = xml.createDatiDocumentiCorrelatiType();
    }

    private static void buildDatiDDT() {
        if (datiDDT.getDataDDT() != null) {
            fattBodyDatiGen.getDatiDDT().add(datiDDT);
        }

        datiDDT = xml.createDatiDDTType();
    }

    private static void buildDatiCassaPrev() {
        if (datiCassaPrev.getTipoCassa() == TipoCassaType.TC_01 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_02 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_03 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_04 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_05 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_06 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_07 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_08 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_09 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_10 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_11 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_12 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_13 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_14 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_15 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_16 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_17 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_18 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_19 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_20 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_21 || datiCassaPrev.getTipoCassa() == TipoCassaType.TC_22) {
            datiGenDoc.getDatiCassaPrevidenziale().add(datiCassaPrev);
        }

        datiCassaPrev = xml.createDatiCassaPrevidenzialeType();
    }

    private static void buildScontoMaggGen() {
        if (scontoMaggDatiGen.getTipo() == TipoScontoMaggiorazioneType.MG || scontoMaggDatiGen.getTipo() == TipoScontoMaggiorazioneType.SC) {
            datiGenDoc.getScontoMaggiorazione().add(scontoMaggDatiGen);
        }

        scontoMaggDatiGen = xml.createScontoMaggiorazioneType();
    }

    private static void buildDettaglioLinee() {
        buildCodiceArticolo();
        buildScontoMaggLin();
        buildAltriDatiGestionali();
        if ((fattBodyDettLin.getNumeroLinea() > 0 && (fattBodyDettLin.getDescrizione() != null && !"".equals(fattBodyDettLin.getDescrizione()))) && (fattBodyDettLin.getPrezzoUnitario() != null || fattBodyDettLin.getPrezzoTotale() != null || fattBodyDettLin.getAliquotaIVA() != null)) {
            fattBodyDatiBeniSrv.getDettaglioLinee().add(fattBodyDettLin);
        }

        fattBodyDettLin = xml.createDettaglioLineeType();
    }

    private static void buildCodiceArticolo() {
        if (codArt.getCodiceTipo() != null && !"".equals(codArt.getCodiceTipo())) {
            fattBodyDettLin.getCodiceArticolo().add(codArt);
        }

        codArt = xml.createCodiceArticoloType();
    }

    private static void buildScontoMaggLin() {
        if (scontoMaggLin.getTipo() == TipoScontoMaggiorazioneType.MG || scontoMaggLin.getTipo() == TipoScontoMaggiorazioneType.SC) {
            fattBodyDettLin.getScontoMaggiorazione().add(scontoMaggLin);
        }

        scontoMaggLin = xml.createScontoMaggiorazioneType();
    }

    private static void buildAltriDatiGestionali() {
        if (altriDatiGest.getTipoDato() != null && !"".equals(altriDatiGest.getTipoDato())) {
            fattBodyDettLin.getAltriDatiGestionali().add(altriDatiGest);
        }

        altriDatiGest = xml.createAltriDatiGestionaliType();
    }

    private static void buildDatiRiepilogo() {
        fattBodyDatiBeniSrv.getDatiRiepilogo().add(fattBodyDatiRiep);

        fattBodyDatiRiep = xml.createDatiRiepilogoType();
    }

    private static void buildDatiPagamento() {
        buildDettaglioPagamento();
        fattBody.getDatiPagamento().add(fattBodyDatiPag);

        fattBodyDatiPag = xml.createDatiPagamentoType();
    }

    private static void buildDettaglioPagamento() {
        fattBodyDatiPag.getDettaglioPagamento().add(fattBodyDettPag);

        fattBodyDettPag = xml.createDettaglioPagamentoType();
    }

    private static void buildAllegato() {
        if (fattBodyAllegato.getNomeAttachment() != null && !"".equals(fattBodyAllegato.getNomeAttachment())) {
            fattBody.getAllegati().add(fattBodyAllegato);
        }

        fattBodyAllegato = xml.createAllegatiType();
    }

    private static void buildFattHeader() {
        if ((!("".equals(cedAnaAna.getDenominazione()) || cedAnaAna.getDenominazione() == null)) || (!("".equals(cedAnaAna.getNome()) || cedAnaAna.getNome() == null))) {
            cedAna.setAnagrafica(cedAnaAna);
        }
        if (!("".equals(cedAnaIdFis.getIdPaese()) || cedAnaIdFis.getIdPaese() == null)) {
            cedAna.setIdFiscaleIVA(cedAnaIdFis);
        }

        ced.setContatti(cedContatti);
        if (cedAna.getAnagrafica() != null || cedAna.getIdFiscaleIVA() != null || (cedAna.getCodiceFiscale() != null && !"".equals(cedAna.getCodiceFiscale()))) {
            ced.setDatiAnagrafici(cedAna);
        }
        ced.setIscrizioneREA(cedRea);
        if (!("".equals(cedSede.getIndirizzo()) || cedSede.getIndirizzo() == null)) {
            ced.setSede(cedSede);
        }
        if (!("".equals(cedStab.getIndirizzo()) || cedStab.getIndirizzo() == null)) {
            ced.setStabileOrganizzazione(cedStab);
        }

        if ((!("".equals(cessAnaAna.getDenominazione()) || cessAnaAna.getDenominazione() == null)) || (!("".equals(cessAnaAna.getNome()) || cessAnaAna.getNome() == null))) {
            cessAna.setAnagrafica(cessAnaAna);
        }
        if (!("".equals(cessAnaIdFis.getIdPaese()) || cessAnaIdFis.getIdPaese() == null)) {
            cessAna.setIdFiscaleIVA(cessAnaIdFis);
        }
        if (!("".equals(cessRapprFisIdFis.getIdPaese()) || cessRapprFisIdFis.getIdPaese() == null)) {
            cessRapprFis.setIdFiscaleIVA(cessRapprFisIdFis);
        }

        if (cessAna.getAnagrafica() != null || cessAna.getIdFiscaleIVA() != null || (cessAna.getCodiceFiscale() != null && !"".equals(cessAna.getCodiceFiscale()))) {
            cess.setDatiAnagrafici(cessAna);
        }
        if ((!("".equals(cessRapprFis.getDenominazione()) || cessRapprFis.getDenominazione() == null)) || (!("".equals(cessRapprFis.getNome()) || cessRapprFis.getNome() == null))) {
            cess.setRappresentanteFiscale(cessRapprFis);
        }
        if (!("".equals(cessSede.getIndirizzo()) || cessSede.getIndirizzo() == null)) {
            cess.setSede(cessSede);
        }
        if (!("".equals(cessStab.getIndirizzo()) || cessStab.getIndirizzo() == null)) {
            cess.setStabileOrganizzazione(cessStab);
        }

        datiTrasm.setContattiTrasmittente(contattiTrasm);
        if (!("".equals(idTrasm.getIdPaese()) || idTrasm.getIdPaese() == null)) {
            datiTrasm.setIdTrasmittente(idTrasm);
        }

        if ((!("".equals(rapprAnaAna.getDenominazione()) || rapprAnaAna.getDenominazione() == null)) || (!("".equals(rapprAnaAna.getNome()) || rapprAnaAna.getNome() == null))) {
            rapprAna.setAnagrafica(rapprAnaAna);
        }
        if (!("".equals(rapprAnaIdFis.getIdPaese()) || rapprAnaIdFis.getIdPaese() == null)) {
            rapprAna.setIdFiscaleIVA(rapprAnaIdFis);
        }

        if (rapprAna.getAnagrafica() != null || rapprAna.getIdFiscaleIVA() != null || (rapprAna.getCodiceFiscale() != null && !"".equals(rapprAna.getCodiceFiscale()))) {
            headRapprFis.setDatiAnagrafici(rapprAna);
        }

        if ((!("".equals(terzoAnaAna.getDenominazione()) || terzoAnaAna.getDenominazione() == null)) || (!("".equals(terzoAnaAna.getNome()) || terzoAnaAna.getNome() == null))) {
            terzoAna.setAnagrafica(terzoAnaAna);
        }
        if (!("".equals(terzoAnaIdFis.getIdPaese()) || terzoAnaIdFis.getIdPaese() == null)) {
            terzoAna.setIdFiscaleIVA(terzoAnaIdFis);
        }

        if (terzoAna.getAnagrafica() != null || terzoAna.getIdFiscaleIVA() != null || (terzoAna.getCodiceFiscale() != null && !"".equals(terzoAna.getCodiceFiscale()))) {
            terzo.setDatiAnagrafici(terzoAna);
        }

        fattHeader = xml.createFatturaElettronicaHeaderType();

        fattHeader.setCedentePrestatore(ced);
        fattHeader.setCessionarioCommittente(cess);
        fattHeader.setDatiTrasmissione(datiTrasm);

        if (headRapprFis.getDatiAnagrafici() != null) {
            fattHeader.setRappresentanteFiscale(headRapprFis);
        }
        if (terzo.getDatiAnagrafici() != null) {
            fattHeader.setTerzoIntermediarioOSoggettoEmittente(terzo);
        }

        cedAnaAna = xml.createAnagraficaType();
        cedAnaIdFis = xml.createIdFiscaleType();
        cedAna = xml.createDatiAnagraficiCedenteType();
        cedContatti = xml.createContattiType();
        cedRea = xml.createIscrizioneREAType();
        cedSede = xml.createIndirizzoType();
        cedStab = xml.createIndirizzoType();
        ced = xml.createCedentePrestatoreType();

        cessAnaAna = xml.createAnagraficaType();
        cessAnaIdFis = xml.createIdFiscaleType();
        cessRapprFisIdFis = xml.createIdFiscaleType();
        cessAna = xml.createDatiAnagraficiCessionarioType();
        cessRapprFis = xml.createRappresentanteFiscaleCessionarioType();
        cessSede = xml.createIndirizzoType();
        cessStab = xml.createIndirizzoType();
        cess = xml.createCessionarioCommittenteType();
        contattiTrasm = xml.createContattiTrasmittenteType();
        idTrasm = xml.createIdFiscaleType();
        datiTrasm = xml.createDatiTrasmissioneType();

        rapprAnaAna = xml.createAnagraficaType();
        rapprAnaIdFis = xml.createIdFiscaleType();
        rapprAna = xml.createDatiAnagraficiRappresentanteType();
        headRapprFis = xml.createRappresentanteFiscaleType();
        terzoAnaAna = xml.createAnagraficaType();
        terzoAnaIdFis = xml.createIdFiscaleType();
        terzoAna = xml.createDatiAnagraficiTerzoIntermediarioType();
        terzo = xml.createTerzoIntermediarioSoggettoEmittenteType();
    }
}
