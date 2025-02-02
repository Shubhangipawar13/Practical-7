class Practical7{
	String patternS(int ln,int size){
	String blankpattern="";
		for(int space =1; space<=size; space++){
			int mid= (1+size)/2;
			if(ln==1||ln==mid||ln==size){
				blankpattern+="*";
			}
			else if(ln<mid&& space==1){
				blankpattern+="*";
			}
			else if(ln>mid && space==size){
			  blankpattern+="*";
		 }
		 else{
		 blankpattern+=" ";
		 }
	}
	return blankpattern;
}
	String patternH(int ln,int size){
		String pattern="";
		for(int space=1; space<=size; space++){
		  int mid = (1+size)/2;
		  if(space==1 || space==size){
			pattern+="*";
		  }
		  else if (ln==mid){
			pattern+="*";
		  }
		  else{
			pattern+=" ";
		 }
    }

	return pattern;
}
	String patternU(int ln,int size){
		String pattern="";
		for(int space=1; space<=size; space++){
		  int mid = (1+size)/2;
		  if(space==1 || space==size){
			pattern+="*";
		  }
		  else if (ln==size){
			pattern+="*";
		  }
		  else{
			pattern+=" ";
		  }
		}
		return pattern;
	
}

	String patternB(int ln,int size){
		String pattern="";
		for(int space=1; space<=size; space++){
		  int mid = (1+size)/2;
		  if((ln==1 && space!=size) || (ln==mid && space!=size) || (ln==size && space!=size)){
			pattern+="*";
		  }
		  else if (space==1 || ((ln%2==0) && space==size)){
			pattern+="*";
		  }
		  else {
			pattern+=" ";
		  }
	  }
	  return pattern;
}

	String patternA(int ln,int size){
		String pattern="";
		for(int space=1; space<=size; space++){
		  int mid = (1+size)/2;
		  if(ln==1 || ln==mid){
			pattern+="*";
		  }
		  else if(space==1 || space==size){
			pattern+="*";
		  }
		  else {
			pattern+=" ";
		  }
		}
		return pattern;
}


	String patternN(int ln,int size){
		String pattern="";
		 for(int space=1; space<=size; space++){
			  if(space==1 || space==size){
				pattern+="*";
			  }
			  else if (ln==space){
				pattern+="*";
			  }
			  else{
				pattern+=" ";
			  }
		}
		return pattern;
}


	String patternG(int ln,int size){
		String pattern="";
		for(int space=1; space<=size; space++){
		  int mid = (1+size)/2;
		  if(ln==1 || ln==size || space==1){
			pattern+="*";
		  }
		  else if(ln==mid && space>=mid){
			pattern+="*";
		  }
		  else if(space==size && ln>=mid){
			pattern+="*";
		  }
		  else{
			pattern+=" ";
		  }
		}
	return pattern;
}



	String patternI(int ln,int size){
		String pattern="";
		 for(int space=1; space<=size; space++){
		  int mid = (1+size)/2;
		  if(ln==1 || ln==size || space==mid){
			pattern+="*";
		  }
		  else{
			pattern+=" ";
		  }
    }
	return pattern;
}

	public static void main(String a[])
	{
		Practical7 s=new Practical7();
		//int size=1;
		int size= Integer.parseInt(a[0]);
		size= 2*size+3;
		for(int ln=1;ln<=size;ln++)
		{
			//System.out.println(s.patternS(ln,size)+"   "+s.patternH(ln,size)+"   "+s.patternU(ln,size)+"   "+s.patternB(ln,size)+"   "+s.patternH(ln,size)+"   "+s.patternA(ln,size)+"    "+s.patternN(ln,size)+"   "+s.patternG(ln,size)+"   "+s.patternI(ln,size));
		System.out.println(s.patternS(ln,size)+"  "+s.patternH(ln,size)+"  "+s.patternU(ln,size)+"  "+s.patternB(ln,size)+"  "+s.patternH(ln,size)+"  "+s.patternA(ln,size)+"  "+s.patternN(ln,size)+"  "+s.patternG(ln,size)+"  "+s.patternI(ln,size));
		}
	}
}
