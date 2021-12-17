package br.com.elder;

public class Usuario {

    private String email;
    private String apelido;

    public Usuario(String email, String apelido) {
        this.email = email;
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public String getApelido() {
        return apelido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                '}';
    }
}
