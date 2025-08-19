public sealed abstract class Employee permits Salesman, Atendente{
    private String email;
    private String senha;
    private boolean admin;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }
    public String login(){
        return "";
    }
    public String logout(){
        return "";
    }
    public String dataChange(){
        return "";
    }
    public String changePassword(){
        return "";
    }
}
