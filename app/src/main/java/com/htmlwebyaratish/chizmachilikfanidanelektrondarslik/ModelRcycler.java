package com.htmlwebyaratish.chizmachilikfanidanelektrondarslik;

import java.io.Serializable;

class ModelRcycler implements Serializable {
    private String lessonName;
    private String loadUrl;

    public ModelRcycler(String codexname, String loadUrl) {
        this.lessonName = codexname;
        this.loadUrl  = loadUrl;

    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLoadUrl() {
        return loadUrl;
    }

    public void setLoadUrl(String loadUrl) {
        this.loadUrl = loadUrl;
    }
}
