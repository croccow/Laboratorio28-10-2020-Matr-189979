package lab28_10_2020INGSW.NumeriPrimi;

import java.util.LinkedList;
import java.util.List;

public class Math {
	
	public List<Integer> generaNumeriPrimi(int n){
		List<Integer> numeriPrimi = new LinkedList<>();
		if(n>=2) {
			numeriPrimi.add(2);
		}
		for(int i=3 ;i<=n; i+=2) {
			if(numeroPrimo(i)) {
				numeriPrimi.add(i);
			}
		}
		return numeriPrimi;
	}
		
		public boolean numeroPrimo(int numero) {
			if(numero < 2) {
				return false;
			}
			for(int i = 2; i < numero; i++) {
				if(numero% i == 0) {
					return false;
				}
			}
			return true;
		}
	
}
