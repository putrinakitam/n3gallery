package projekoop.datasource;

import java.util.List;

import java.util.ArrayList;

import projekoop.models.IphoneModel;
import projekoop.models.SamsungModel;

public class PhoneDatasource {
    public static List<SamsungModel> getSamsung(){
        List<SamsungModel> samsungList= new ArrayList<>();
        samsungList.add(new SamsungModel("SAMSUNG 23 PLUS", "sam23plus.png", "samsung23plus.png", "https://www.samsung.com/id/smartphones/galaxy-s23/buy/", 200_000));
        samsungList.add(new SamsungModel("SAMSUNG 23 ULTRA", "sam23ultra.png", "samsung23ultra.png", "https://www.samsung.com/id/smartphones/galaxy-s23/buy/",350_000));
        samsungList.add(new SamsungModel("SAMSUNG Z FLIP", "samFlip.png", "samsungFlippp.png", "https://www.samsung.com/id/smartphones/galaxy-z-flip4/buy/",350_000));
        samsungList.add(new SamsungModel("SAMSUNG Z FOLD", "samFold.png", "samsungFoldd.png", "https://www.samsung.com/id/smartphones/galaxy-z-fold4/buy/",350_000));
        samsungList.add(new SamsungModel("SAMSUNG M SERIES", "samM.png", "samsungM14.png", "https://www.samsung.com/id/smartphones/galaxy-m/galaxy-m14-blue-128gb-sm-m146bzbvxid/buy/?cid=id_pd_ppc_google_m14_launch_049-mx-m14-23q2-lc-r1-ppc-conv-w-kwb-m14-na_text_warm-none-20230601_none&gclid=CjwKCAjwyeujBhA5EiwA5WD7_Q_3Y2x6_0WC2HipbGD2DQ1htyhFqSf-SW9ITQHLQ3mXR7cWoG0IsBoCT40QAvD_BwE&gclsrc=aw.ds",350_000));
        samsungList.add(new SamsungModel("SAMSUNG a SERIES", "samM54.png", "samsungA54.png", "https://www.samsung.com/id/smartphones/galaxy-a/galaxy-a54-5g-awesome-violet-128gb-sm-a546elvcxid/buy/?gclid=CjwKCAjwyeujBhA5EiwA5WD7_RtGw2hccl2WBPmrlSSVzqjZHjhrQQZSSsZokwbDToHINslLzjFtUBoCMscQAvD_BwE&cid=id_pd_ppc_google_amid_sustain_064-mx-amid-23q2-ss-r1-ppc-conv-w-kwb-a54.5g-na_text_warm-none-20230601_none&gclsrc=aw.ds&ef_id=ZBkjlAAB8pEbzQAo:20230603124930:s",350_000));
        return samsungList;
    }

    public static List<IphoneModel> getIphone(){
        List<IphoneModel> iphoneList = new ArrayList<>();
        iphoneList.add(new IphoneModel("IPHONE 14 PRO MAX", "ip14promax.png", "ip14promax.png", "https://ibox.co.id/product/iphone-14-pro-max-ibox",40_000));
        iphoneList.add(new IphoneModel("IPHONE 13 PRO MAX", "ip13promax.png", "ip13promax.png", "https://ibox.co.id/product/iphone-13-pro-max-ibox", 230_000));
        iphoneList.add(new IphoneModel("IPHONE 12 PRO MAX", "ip12promax.png", "ip12promax.png", "https://ibox.co.id/product/iphone-12-pro-max-ibox", 50_000));
        iphoneList.add(new IphoneModel("IPHONE 14 PLUS", "ip14plus.png", "ip14plus.png", "https://ibox.co.id/product/iphone-14-plus-ibox",60_000));
        iphoneList.add(new IphoneModel("IPHONE 11 PRO MAX", "ip11.png", "11Promax.png", "https://ibox.co.id/product/apple-iphone-11-new-package",80_000));
        iphoneList.add(new IphoneModel("IPHONE SE", "ipSE.png", "ipSe.png", "https://ibox.co.id/product/iphone-se-3rd-gen",79_000));
        return iphoneList;
    }   
    
}
