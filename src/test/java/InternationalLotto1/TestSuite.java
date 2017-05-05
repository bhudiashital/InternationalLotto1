package InternationalLotto1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

/**
 * Created by SBhudia on 10/03/2017.
 */
public class TestSuite extends DriverManager
{

    @BeforeTest

    public static void open()
    {
        openBrowser();
    }


    @Test
    public static void createAfrican() throws InterruptedException {
        ABAfricanLottoBet ABAfricanLottoBet = new ABAfricanLottoBet();
        ABAfricanLottoBet.abAfrican();
    }

    @Test
    public static void createAustrian() throws InterruptedException {
        ALAustrian alAustrian1 = new ALAustrian();
        alAustrian1.alAustrian();
    }


    @Test
    public static void createBarbados() throws InterruptedException {
        BABarbados baBarbados1 = new BABarbados();
        baBarbados1.baBarbados();
    }


    @Test

    public static void createBelgium() throws InterruptedException {
        BBBelgiumLottoBet bbBelgiumLottoBet1 = new BBBelgiumLottoBet();
        bbBelgiumLottoBet1.bbBelgium();
    }


    @Test

    public static void createBrazilian() throws InterruptedException {
        BLBrazilian blBrazilian1 = new BLBrazilian();
        blBrazilian1.blBrazilian();
    }

    @Test
    public static void createCalifornia() throws InterruptedException {
        CACalifornia caCalifornia1 = new CACalifornia();
        caCalifornia1.caCalifornia();
    }

    @Test

    public static void createColumbia() throws InterruptedException {
        CBColumbiaBaloto cbColumbiaBaloto1 = new CBColumbiaBaloto();
        cbColumbiaBaloto1.cbColumbiaBaloto();
    }

    @Test
    public static void createCanadian() throws InterruptedException {
        CLCanadianLottoBet clCanadianLottoBet1 = new CLCanadianLottoBet();
        clCanadianLottoBet1.clCanadianLottoBet();
    }

    @Test
    public static void createCMChineseLotto() throws InterruptedException {
        CMChineseLotto cmChineseLotto1 = new CMChineseLotto();
        cmChineseLotto1.cmChineseLotto();
    }
    @Test
    public static void createDMDailyMillion() throws InterruptedException {
        DMDailyMillionLottoBet dmDailyMillionLottoBet = new DMDailyMillionLottoBet();
        dmDailyMillionLottoBet.dmDailyMillionLotto();
    }

    @Test
    public static void createEMEuroMillion() throws InterruptedException {
        EMEuroMillions emEuroMillions1 = new EMEuroMillions();
        emEuroMillions1.emEuroMillions();
    }


    @Test
    public static void createFinland() throws InterruptedException {
        FIFinland fiFinland1 = new FIFinland();
        fiFinland1.fiFinland();
    }


    @Test
    public static void createHongKongMark6() throws InterruptedException {
        HMHongKong hmHongKong1 = new HMHongKong();
        hmHongKong1.hmHongKongMark6();
    }

    @Test
    public static void createPWIndianLottoBet() throws InterruptedException {
        PWIndianLotto pwIndianLotto = new PWIndianLotto();
        pwIndianLotto.pwIndianLottoBet();
    }

    @Test
    public static void createOLGreek() throws InterruptedException {
        OLGreek olGreek1 = new OLGreek();
        olGreek1.olGreek();
    }

    @Test
    public static void createSEItalian() throws InterruptedException {
     SEItalianSuperEnalotto seItalianSuperEnalotto  = new SEItalianSuperEnalotto();
     seItalianSuperEnalotto.seItalian();
    }


    @Test
    public static void createNLDutch() throws InterruptedException {
        NLDutchLotto nlDutchLotto1= new NLDutchLotto();
        nlDutchLotto1.nlDutchLotto();
    }


    @Test

    public static void createFLFrenchLotto() throws InterruptedException {
        FLFrenchLottoBet flFrenchLottoBet = new FLFrenchLottoBet();
        flFrenchLottoBet.flFrenchLotto();
    }

    @Test
    public static void createGLGermanLotto() throws InterruptedException {
        GLGermanLottoBet glGermanLottoBet = new GLGermanLottoBet();
        glGermanLottoBet.glGermanLotto();
    }

    @Test
    public static void createGPAtlantaGeorgiasPowerBall() throws InterruptedException {
        GPAtlantaGeorgiasPowerBall gpAtlantaGeorgiasPowerBall1 = new GPAtlantaGeorgiasPowerBall();
        gpAtlantaGeorgiasPowerBall1.gpAtlantaGeogiasPowerBall();
    }


    @Test

    public static void createPiIsraeli() throws InterruptedException {
        PIIsraeli piIsraeli1 = new PIIsraeli();
        piIsraeli1.piIsraeli();
    }


    @Test
    public static void createSZSwiterland() throws InterruptedException {
        SZSwitzerland szSwitzerland1 = new SZSwitzerland();
        szSwitzerland1.szSwitzerland();
    }


    @Test
    public static void createNZNewZealand() throws InterruptedException {
        NZNewZealand nzNewZealand1= new NZNewZealand();
        nzNewZealand1.nzNewZealand();
    }



    @Test
    public static void createSTSingapore() throws InterruptedException {
        STSingaporeToto stSingaporeToto = new STSingaporeToto();
        stSingaporeToto.stSingapore();
    }


    @Test
    public static void createNYNewYork() throws InterruptedException {
        NYNewYorkLottoBet nyNewYorkLottoBet = new NYNewYorkLottoBet();
        nyNewYorkLottoBet.nyNewYorkLotto();
    }



    @Test
    public static void createPLPolish() throws InterruptedException {
        PLPolish plPolish1 = new PLPolish();
        plPolish1.plPolish();

    }


    @Test
    public static void createRLRomanian() throws InterruptedException {
        RLRomanian rlRomanian1 = new RLRomanian();
        rlRomanian1.rlRomanian();
    }

    @Test
    public static void createRSRussia() throws InterruptedException {
        RSRussian rsRussian1 = new RSRussian();
        rsRussian1.rsRussian();
    }

    @Test
    public static void createSLSpanishLotto() throws InterruptedException {
        SLSpanishLottoBet slSpanishLottoBet = new SLSpanishLottoBet();
        slSpanishLottoBet.slSpanishLotto();
    }


    @Test
    public static void createMLTurkish() throws InterruptedException {
        MLTurkish mlTurkish1 = new MLTurkish();
        mlTurkish1.mlTurkish();
    }

    @Test
    public static void createULUkraine() throws InterruptedException {
        ULUkraine ulUkraine1 = new ULUkraine();
        ulUkraine1.ukUkraine();
    }

    @Test
    public static void createHLHungary() throws InterruptedException {
        HLHungary hlHungary1 = new HLHungary();
        hlHungary1.hlHungary();
    }



    @Test
    public static void createVLFinlandVikingLottoBet() throws InterruptedException {
        VLFinlandVikingLottoBet vlFinlandVikingLottoBet1 = new VLFinlandVikingLottoBet();
        vlFinlandVikingLottoBet1.vlFinlandVikingLottoBet();
    }

    @Test
    public static void createOzOzLotteries() throws InterruptedException {
        OZOZLotteries ozozLotteries1 = new OZOZLotteries();
        ozozLotteries1.ozOzLotteries();
    }

    @Test
    public static void createSVSwedish() throws InterruptedException {
        SVSwedish svSwedish1 = new SVSwedish();
        svSwedish1.svSwedish();
    }

    @Test
    public static void createUKuklotto() throws InterruptedException {
        UKUKlotto ukuKlotto1 = new UKUKlotto();
        ukuKlotto1.ukUKlotto();
    }

    @AfterTest

    public static  void close()
    {
        try {
            closeBrowser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}