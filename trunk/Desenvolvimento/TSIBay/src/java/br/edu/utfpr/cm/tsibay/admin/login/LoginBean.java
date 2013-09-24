package br.edu.utfpr.cm.tsibay.admin.login;

import br.edu.utfpr.cm.tsibay.daos.DaoPessoa;
import br.edu.utfpr.cm.tsibay.model.Pessoa;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * Simple login bean.
 *
 * @author itcuties
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 7765876811740798583L;

    private String username;
    private String password;
    private static Pessoa usuario;
    private boolean loggedIn=false;
     private static DaoPessoa daoPessoa;
     
    @ManagedProperty(value = "#{navigationBean}")
    private NavigationBean navigationBean;

    /**
     * Login operation.
     *
     * @return
     */
    public String doLogin() {

//        for (String user : users) {
//            String dbUsername = user.split(":")[0];
//            String dbPassword = user.split(":")[1];
        if (setPessoa()) {
            System.out.println(usuario.getSenha());
            if (usuario.getSenha().equals(password)) {
                loggedIn = true;
                return navigationBean.redirectAdmin();
            }
        }
//        }

        FacesMessage msg = new FacesMessage("Usuário ou senha incorretos!", "ERROR MSG");
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);

        // To to login page
        return navigationBean.login();

    }

    /**
     * Logout operation.
     *
     * @return
     */
    public String doLogout() {
        // Set the paremeter indicating that user is logged in to false
        loggedIn = false;
        username = "";
        password = "";
        usuario = null;
        // Set logout message
//		FacesMessage msg = new FacesMessage("Logout success!", "INFO MSG");
////		msg.setSeverity(FacesMessage.SEVERITY_INFO);
//		FacesContext.getCurrentInstance().addMessage(null, msg);

        return navigationBean.login();
    }

    // ------------------------------
    // Getters & Setters 
    private boolean setPessoa() {
        daoPessoa = new DaoPessoa();
        usuario = daoPessoa.obterPorLogin(username);
        if (usuario != null) {
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public void setNavigationBean(NavigationBean navigationBean) {
        this.navigationBean = navigationBean;
    }
    
    public static Long getIdPessoa(){
        return usuario.getId();
    }
    
    public static void updatePessoa(){
        daoPessoa = new DaoPessoa();
        usuario = daoPessoa.obterPorId(usuario.getId().intValue());
    }
}
