public class Manager {
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return true;
    }
    public String financeDocument(){
        return "";
    }
    public String consultSales(){
        return "";
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


    private String email;
    private String senha;
    private final boolean admin = true;
}
