public class Threshold {
	public int Threshold(int LOC_CLASS,int LOC_METHOD,int NMD,int NPRIVFIELD) {
		int codeSmell=0;
		
		if((LOC_CLASS>=1500 && LOC_METHOD>=129)||NMD>=100){
			codeSmell=1;
		}
		else if(LOC_METHOD>=151){
			codeSmell=2;
		}
		else if(NPRIVFIELD>=7 && NMD>=16){
			codeSmell=3;
		}
	return codeSmell;
	}
	
}
