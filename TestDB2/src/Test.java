//＜Test を作成してインスタンス化および実行する＞
public class Test {
	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");
		dao.selectAll();
		dao.selectByPassword("123");
		dao.insert(4, "shiro", "012");
		dao.delete("shiro");
	}	
}