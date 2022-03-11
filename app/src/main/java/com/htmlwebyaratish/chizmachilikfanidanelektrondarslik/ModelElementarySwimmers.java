package com.htmlwebyaratish.chizmachilikfanidanelektrondarslik;

class ModelElementarySwimmers {
    private int webViewImage;
    private String webViewtitle;
    private String webViewdesc;
    private String webViewurl;


    public ModelElementarySwimmers(int webViewImage, String webViewtitle, String webViewdesc, String webViewurl) {
        this.webViewImage = webViewImage;
        this.webViewtitle = webViewtitle;
        this.webViewdesc = webViewdesc;
        this.webViewurl = webViewurl;
    }

    public int getWebViewImage() {
        return webViewImage;
    }

    public void setWebViewImage(int webViewImage) {
        this.webViewImage = webViewImage;
    }

    public String getWebViewtitle() {
        return webViewtitle;
    }

    public void setWebViewtitle(String webViewtitle) {
        this.webViewtitle = webViewtitle;
    }

    public String getWebViewdesc() {
        return webViewdesc;
    }

    public void setWebViewdesc(String webViewdesc) {
        this.webViewdesc = webViewdesc;
    }

    public String getWebViewurl() {
        return webViewurl;
    }

    public void setWebViewurl(String webViewurl) {
        this.webViewurl = webViewurl;
    }

    @Override
    public String toString() {
        return "ModelElementarySwimmers{" +
                "webViewImage=" + webViewImage +
                ", webViewtitle='" + webViewtitle + '\'' +
                ", webViewdesc='" + webViewdesc + '\'' +
                ", webViewurl='" + webViewurl + '\'' +
                '}';
    }
}
