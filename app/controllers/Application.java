package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    
    
    public static void index() {
        render();
    }

        public static void login(){
           
              
            render();
        }
         public static void autenticar(String usuario , String password){
             session.put("cliente", usuario);
             index();
        }
}