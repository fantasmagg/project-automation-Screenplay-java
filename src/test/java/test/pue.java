package test;


import org.junit.Assert;
import org.testng.annotations.Test;

public class pue {
    @Test(priority = 1)
    public  void sss(){


        String getText ="holaaaaaaaaaaaaaaaa";
        String t = "j";
        String text="holaaaaaaaaaaaaaaaa";
//        boolean isFound = getText.contains(text);
//        Assert.assertTrue("el texto esta"+text+"el texto actual es : "+getText,isFound);


        Assert.assertEquals("noT equals",getText,text);

    }


}
