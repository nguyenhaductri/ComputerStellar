/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.ui;

import poly.cafe.util.XDialog;

/**
 *
 * @author 6a3fs
 */
public interface ChangePaswordControler {
    void open();
    void save();
    default void exit(){
    if(XDialog.confirm("Bạn muốn kết thúc?")){
    System.exit(0);
        }
     }
}
