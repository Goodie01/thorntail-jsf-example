package org.goodiemania.thorntail.jsf;

import java.io.Serializable;
import javax.inject.Named;

@Named
public class LoginController implements Serializable {
    public String login() {
        return "/index?faces-redirect=true";
    }
}
