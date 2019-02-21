import java.util.ArrayList;
import java.util.List;

public class OrdenamientoContar {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int x=0;x<10;x++)
		numeros.add((int) ((Math.random()*20)+1));
		
		ordenaCuentas(1, 20, numeros);
	}
	
	public static void ordenaCuentas(int min,int max, List<Integer> numeros)
	{
		List<Integer> contar= new ArrayList<Integer>();
		for (int i = 0; i < max-min; i++) {
			contar.add(0);
		}
		
		for (Integer integer : numeros) {
			contar.set(integer-min, (contar.get(integer))+1);
		}
		
		System.out.println(numeros);
		System.out.println(contar);
		
		
		
	}

}
