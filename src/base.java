
public class base {
	int cs;
	public int personB(int pLOC_CLASS,int pLOC_METHOD,int pNMD,int pNPRIVFIELD) {
		int locC=pLOC_CLASS;
		int locM=pLOC_METHOD;
		int nmd=pNMD;
		int npriv=pNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
	}
	public int classroomB(int clLOC_CLASS,int clLOC_METHOD,int clNMD,int clNPRIVFIELD) {
		int locC=clLOC_CLASS;
		int locM=clLOC_METHOD;
		int nmd=clNMD;
		int npriv=clNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
	}
	public int professorB(int prlLOC_CLASS,int prlLOC_METHOD,int prlNMD,int prlNPRIVFIELD) {
		int locC=prlLOC_CLASS;
		int locM=prlLOC_METHOD;
		int nmd=prlNMD;
		int npriv=prlNPRIVFIELD;
		Threshold std=new Threshold();
		cs=std.Threshold(locC, locM, nmd, npriv);
		return cs;
		
	}
}
