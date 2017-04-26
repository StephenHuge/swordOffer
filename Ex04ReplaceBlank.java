package swordOffer;

/**
 * 这是剑指offer的第四题：将字符串中的空格替换成"%20"
 * 
 * @author Steve Huge
 */
public class Ex04ReplaceBlank {
	public static void main(String args[]){
		String s="We are happy.";
		Ex04ReplaceBlank replace = new Ex04ReplaceBlank();  
		System.out.println(replace.replaceBlank(s));
	}
	/**
	 * 替换字符串input中的空格为“%20”。
	 * @param input	一个 字符串
	 * @return	返回替换完成后的新字符串，其中的空格均被替换为“%20”
	 */
	public String replaceBlank(String input){
		if(input==null)
		return null;
//		由于是单线程编程，我们在这里舍弃掉StringBuffer，改用StringBuilder
//		StringBuffer outputBuffer=new StringBuffer();
		StringBuilder output = new StringBuilder();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				output.append("%20");
//				output.append("2");
//				output.insert(i, " ");
			}else {
				output.append(String.valueOf(input.charAt(i)));
			}
		}
		return new String(output);
	}
}
