import java.util.Random;

public class results {
	int cs;
	public int student(int sLOC_CLASS,int sLOC_METHOD,int sNMD,int sNPRIVFIELD) {
		int locC=sLOC_CLASS;
		int locM=sLOC_METHOD;
		int nmd=sNMD;
		int npriv=sNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
	}
	public int person(int pLOC_CLASS,int pLOC_METHOD,int pNMD,int pNPRIVFIELD) {
		int locC=pLOC_CLASS;
		int locM=pLOC_METHOD;
		int nmd=pNMD;
		int npriv=pNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
	    return cs;
	}
	public int university(int uLOC_CLASS,int uLOC_METHOD,int uNMD,int uNPRIVFIELD) {
		int locC=uLOC_CLASS;
		int locM=uLOC_METHOD;
		int nmd=uNMD;
		int npriv=uNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
		}
	public int course(int cLOC_CLASS,int cLOC_METHOD,int cNMD,int cNPRIVFIELD) {
		int locC=cLOC_CLASS;
		int locM=cLOC_METHOD;
		int nmd=cNMD;
		int npriv=cNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
	}
	public int classroom(int clLOC_CLASS,int clLOC_METHOD,int clNMD,int clNPRIVFIELD) {
		int locC=clLOC_CLASS;
		int locM=clLOC_METHOD;
		int nmd=clNMD;
		int npriv=clNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
	}
	public int admin(int aLOC_CLASS,int aLOC_METHOD,int aNMD,int aNPRIVFIELD) {
		int locC=aLOC_CLASS;
		int locM=aLOC_METHOD;
		int nmd=aNMD;
		int npriv=aNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
	}	
}
