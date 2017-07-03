import javafx.scene.effect.Effect;
import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;

import java.net.MalformedURLException;
import java.util.LinkedList;

/**
 * Created by mumarm45 on 03/07/2017.
 */
public class Main {

    public static  void  main(String args[]){
        System.out.println("Please enter argument as ");
        System.out.println("Domain, username, password, ip/name , sharepath");
        if(args.length<3){
            System.out.println("Enter Correct number of  Arguments");
        }else{
            getSMBFiles(args[0],args[1],args[2],args[3],args[4]);
        }
    }



    private static void  getSMBFiles(String domain, String username, String password,String machineIp, String folderPath) {
        Prompts promptConfig = Prompts.getInstance();
        try {


            String se = domain + ";" + username + ":" + password;
            System.out.println("Get property value ...................."+ se);

            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication("${se}");

            //log.info("SERVER:::::::::::::: ${settings.promptLocation}")
            SmbFile folder = new SmbFile("smb://" + machineIp + "/" + folderPath , auth);


            if (folder.exists()) {

                System.out.println("OK");
            } else {
                System.out.println("Not Exist");
            }


        } catch (MalformedURLException mFEx) {
            System.out.println(mFEx.getMessage());
            mFEx.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }


    }

}


