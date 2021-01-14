package io.codejournal.maven.wsdl2java;

import java.math.BigInteger;
import java.net.URI;
import java.net.URL;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

public class Runner {

    public static void main(String[] args) throws Exception {

        final String endpoint = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";

        final URL url = URI.create(endpoint).toURL();

        final NumberConversion service = new NumberConversion(url);

        final NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);

        System.out.println(port.numberToWords(BigInteger.valueOf(10)));
    }
}
