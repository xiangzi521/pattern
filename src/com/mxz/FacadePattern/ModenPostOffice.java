package com.mxz.FacadePattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class ModenPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();

    Police police = new Police();

    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        police.checkLetter();
        letterProcess.sendLetter();
    }

}
