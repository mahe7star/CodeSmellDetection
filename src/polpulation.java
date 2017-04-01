import java.util.Arrays;
import java.util.Random;

public class polpulation {
	public int[][] sys=new int[6][5];
	public int baseE[]=new int[3];
	String smell[][]=new String[6][5];
	String smellB[]=new String[3];
public void population() {
	int LOC_CLASS=0,LOC_METHOD=0,NMD=0,NPRIVFIELD=0,i;
	
	Random rand = new Random();
	results clas=new results();
	base bs=new base();
	 System.out.println("Detecion Results");
	          for(i=0;i<5;i++){
	
	        	  LOC_CLASS=rand.nextInt(2000) + 1;
		       		LOC_METHOD=rand.nextInt(250) + 1;
		       		NMD=rand.nextInt(150) + 1;
		       		NPRIVFIELD=rand.nextInt(20) + 1;
		       		sys[0][i]=clas.student(LOC_CLASS, LOC_METHOD, NMD, NPRIVFIELD);
	        	  
	          		}	  
	        
		       for(i=0;i<5;i++){
		
		    	   LOC_CLASS=rand.nextInt(2000) + 1;
		       		LOC_METHOD=rand.nextInt(250) + 1;
		       		NMD=rand.nextInt(150) + 1;
		       		NPRIVFIELD=rand.nextInt(20) + 1;
		       		sys[1][i]=clas.person(LOC_CLASS, LOC_METHOD, NMD, NPRIVFIELD); 
		    	   
		          }
	          
		       for(i=0;i<5;i++){
				
		    	   LOC_CLASS=rand.nextInt(2000) + 1;
		       		LOC_METHOD=rand.nextInt(250) + 1;
		       		NMD=rand.nextInt(150) + 1;
		       		NPRIVFIELD=rand.nextInt(20) + 1;
		       		sys[2][i]=clas.university(LOC_CLASS, LOC_METHOD, NMD, NPRIVFIELD);	        	 
		    	       
				          }    
				
				      	
		       	for(i=0;i<5;i++){
					
		       		LOC_CLASS=rand.nextInt(2000) + 1;
		       		LOC_METHOD=rand.nextInt(250) + 1;
		       		NMD=rand.nextInt(150) + 1;
		       		NPRIVFIELD=rand.nextInt(20) + 1;
					sys[3][i]=clas.course(LOC_CLASS, LOC_METHOD, NMD, NPRIVFIELD);      	 
		       		      
					          }
				      	
		       	for(i=0;i<5;i++){
		       		
		       		LOC_CLASS=rand.nextInt(2000) + 1;
		       		LOC_METHOD=rand.nextInt(250) + 1;
		       		NMD=rand.nextInt(150) + 1;
		       		NPRIVFIELD=rand.nextInt(20) + 1;
					sys[4][i]=clas.classroom(LOC_CLASS, LOC_METHOD, NMD, NPRIVFIELD);      	 
		       			        
						          
					          }     
						       
		       	for(i=0;i<5;i++){
							
		       		LOC_CLASS=rand.nextInt(2000) + 1;
		       		LOC_METHOD=rand.nextInt(250) + 1;
		       		NMD=rand.nextInt(150) + 1;
		       		NPRIVFIELD=rand.nextInt(20) + 1;
					sys[5][i]=clas.admin(LOC_CLASS, LOC_METHOD, NMD, NPRIVFIELD);     	 
		       				        
		       				}
		       	
		       	
		       	for(int j=0;j<6;j++){
		       		for(i=0;i<5;i++){
		       			if(sys[j][i]==1){
		       				smell[j][i]="Blob";
		       			}
		       			else if(sys[j][i]==2){
		       				smell[j][i]=" FD ";
		       			}
		       			else if(sys[j][i]==3){
		       				smell[j][i]=" SC ";
		       			}
		       		}
		       		
		       	}
						          
		        System.out.println("---------------------");
		        System.out.println(" Student    	|"+smell[0][0]+"  "+smell[0][1]+"  "+smell[0][2]+"  "+smell[0][3]+"  "+smell[0][4]+" |");
		        System.out.println(" Person     	|"+smell[1][0]+"  "+smell[1][1]+"  "+smell[1][2]+"  "+smell[1][3]+"  "+smell[1][4]+" |");
		        System.out.println(" Universiy  	|"+smell[2][0]+"  "+smell[2][1]+"  "+smell[2][2]+"  "+smell[2][3]+"  "+smell[2][4]+" |");
		        System.out.println(" Course     	|"+smell[3][0]+"  "+smell[3][1]+"  "+smell[3][2]+"  "+smell[3][3]+"  "+smell[3][4]+" |");
		        System.out.println(" Classroom  	|"+smell[4][0]+"  "+smell[4][1]+"  "+smell[4][2]+"  "+smell[4][3]+"  "+smell[4][4]+" |");
		        System.out.println(" Admin      	|"+smell[5][0]+"  "+smell[5][1]+"  "+smell[5][2]+"  "+smell[5][3]+"  "+smell[5][4]+" |");
		        System.out.println("---------------------");
	
		        
		      
		        int LOC_CLASSp=rand.nextInt(2000) + 1;
	       		int LOC_METHODp=rand.nextInt(250) + 1;
	       		int NMDp=rand.nextInt(150) + 1;
	       		int NPRIVFIELDp=rand.nextInt(20) + 1;
				 
			baseE[0]=bs.personB(LOC_CLASSp, LOC_METHODp, NMDp, NPRIVFIELDp);
			    
			 int LOC_CLASSc=rand.nextInt(2000) + 1;
	       		int LOC_METHODc=rand.nextInt(250) + 1;
	       		int NMDc=rand.nextInt(150) + 1;
	       		int NPRIVFIELDc=rand.nextInt(20) + 1;
			baseE[1]=bs.classroomB(LOC_CLASSc, LOC_METHODc, NMDc, NPRIVFIELDc);
			 
			baseE[2]=bs.professorB(LOC_CLASS, LOC_METHOD, NMD, NPRIVFIELD);
			 
			 
			 for(i=0;i<3;i++){
	       			if(baseE[i]==1){
	       				smellB[i]="Blob";
	       			}
	       			else if(baseE[i]==2){
	       				smellB[i]=" FD ";
	       			}
	       			else if(baseE[i]==3){
	       				smellB[i]=" SC ";
	       			}
	       		}
			  System.out.println("Base of examples");
			     System.out.println("---------------------");
			 System.out.println(" Person      	| "+smellB[0]+" |");
			 System.out.println(" Classroom   	| "+smellB[1]+" |");  
			 System.out.println(" Professor   	| "+smellB[2]+" |");
			 System.out.println("---------------------");
      	}





int flag=0;
int a[]=new int[5];
float f[]=new float[5];

public void matching(){
	  
    	for(int i=0;i<5;i++){
    	if(sys[1][i]==baseE[0] && sys[4][i]==baseE[1]){
    		flag=flag+2;
    	}	
    	else if(sys[1][i]==baseE[0]){
    		flag++;
    	}
    	else if(sys[4][i]==baseE[1]){
    		flag++;
    	}
    	
       a[i]=flag;
    	}	
		}
public void fitness(){
	for(int i=0;i<5;i++){
		float t=(a[i]*2+a[i]);
		f[i]=t/12;
		System.out.println("Fitnessfunction of System "+(i+1)+" = "+f[i]);
		}	
     Arrays.sort(f);
     System.out.println("---------------------");
     System.out.println("Fittest = " + f[0]);
	
}



}
				  