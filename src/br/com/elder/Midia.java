package br.com.elder;

public enum Midia implements StringValueEnum{

    AUDIO   ("AUDIO",   "Mensagem de Áudio" ),
    IMAGEM  ("IMAGEM",  "Mensagem de Imagem"),
    VIDEO   ("VIDEO",   "Mensagem de Vídeo" );

    private String value;
    private String displayName;

    Midia(String value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }




}
