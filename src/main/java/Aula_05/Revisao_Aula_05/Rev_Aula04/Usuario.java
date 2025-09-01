package Aula_05.Revisao_Aula_05.Rev_Aula04;

class Usuario {
    private String username;
    private String password; // Apenas para uso interno na classe

    public Usuario(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public String getUsername() {
        return username;
    }

    public boolean autenticar(String senhaTentativa) {
        if (senhaTentativa == password) {
            return this.password.equals(senhaTentativa);
        }
        else {
            return false;
        }
    }
}


