package managers;

import models.Chapter1Page;
import models.MainPage;

public class GetModel {

    private static GetModel instance;

    public static GetModel get(){
        if (instance == null){
            instance = new GetModel();
        }
        return instance;
    }


    public MainPage getMainPage(){
        return MainPage.get();
    }

    public Chapter1Page getChapter1Page(){
        return Chapter1Page.get();
    }
}
