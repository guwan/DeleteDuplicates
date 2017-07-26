package top.knos;

import java.util.List;

public interface Processor <T> {
	default
	public long startTime(){
		return System.currentTimeMillis();
	}
	public List<T> distinct(List<T> list);
	default
	public void printTime(long size,long startTime){
		long costTime=System.currentTimeMillis()-startTime;

        String clazzName = this.getClass().getSimpleName();  
        //String name =clazzName.substring(0, clazzName.lastIndexOf('.'));  
		System.out.println(String.format("class[%s]:\t\tList size :%d,cost time %d ms to distinct.",clazzName,size,costTime));
	}

}
