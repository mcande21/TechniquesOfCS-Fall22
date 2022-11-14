package Chap9immutableobjects;

import java.math.BigInteger;

public class DiffieHellman {

    public static void main(String[] args) {
        BigInteger p = new BigInteger("7919");

        BigInteger Apriv = new BigInteger("123456789");
        // Alice can now computer public key
        BigInteger Apub= BigInteger.TWO.modPow(Apriv, p);

        // send Bob the public key

        // Bob picks private key
        BigInteger Bpriv = new BigInteger("497");

        //Bob computes his public key
        BigInteger Bpub = BigInteger.TWO.modPow(Bpriv, p);

        //Alice can now compute the shared key
        BigInteger Ashared = Bpub.modPow(Apriv, p);

        // Bob can compute the shared key
        BigInteger Bshared = Apub.modPow(Bpriv, p);

        System.out.println(Ashared);
        System.out.println(Bshared);




    }

}
