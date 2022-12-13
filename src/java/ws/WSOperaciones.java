/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "user") String user, @WebParam(name = "contrasenia") String contrasenia) {
        if (user.equals("Pavel") && contrasenia.equals("Pavel2020")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "procesarpago")
    public int procesarpago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if(pago>=total){
            //retornar vuelto
            return pago-total;
        }else{
            return -1;
        }
    }

}
