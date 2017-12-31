package com.hugeardor.vidit.simsimichatbot.Helper;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by vidit on 31/12/17.
 */

public class HttpDataHandler {

    static String stream=null;

    public HttpDataHandler() {
    }

    public String GetHTTPData(String urlString)
    {
        try{
            URL url  = new URL(urlString) ;

            HttpsURLConnection  urlConnection= (HttpsURLConnection)url.openConnection() ;
                       //HttpsURLConnection urlConnection = (HttpURLConnection)url.openConnection() ;

            if(urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder() ;
                String line ;
                while((line = r.readLine() )!= null)
                {
                        sb.append(line) ;

                }

                stream = sb.toString();
                urlConnection.disconnect();


            }
        }
        catch (MalformedURLException e)
        {
                e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally {

        }
        return stream ;

    }

}
