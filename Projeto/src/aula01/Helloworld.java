package aula01;

import java.math.BigDecimal;

public class Helloworld {
	public static void main (String[] args)
	{ 
		Double wrapper=2.0;
		double nota=7.8d;
		float faltounota=6.99999f;
		short lugarnafila=44;
		long lugarnorole=135;
		byte idadedocapeta=66;
		boolean ehgay= true;
		char inicialdoidiota='T';
		BigDecimal minhaconta = new BigDecimal("5684289.94");
		BigDecimal impostoderenda = new BigDecimal("0.17");
		BigDecimal meuricodinheirinho = minhaconta.multiply(impostoderenda);
		
		String minhastring = "Target";
		byte b=1;
		wrapper = (double) b;
		
		System.out.println( "Hello you clowns");
		System.out.println( wrapper);
		System.out.println( nota);
		System.out.println (minhastring.concat("trust"));
		String minhastring1 = minhastring.concat("trust").substring(9);
		System.out.println (minhastring1);
		System.out.println (faltounota);
		System.out.println (lugarnorole);
		System.out.println (idadedocapeta);
		System.out.println (lugarnafila);
		System.out.println (ehgay);
		System.out.println (inicialdoidiota);
		System.out.println (meuricodinheirinho.setScale(2, BigDecimal.ROUND_HALF_EVEN));
	}

}
