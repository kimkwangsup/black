package proj.sql;

public class BoardSQL {
	public static final int SEL_ALL_LIST = 1001;
	
	public static final int ADD_BOARD = 3001;
	
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL_LIST:
			buff.append("SELECT ");
			buff.append("	bno, title, id, wdate, views ");
			buff.append("FROM ");
			buff.append("	board b, member m ");
			buff.append("WHERE ");
			buff.append("	writer = mno ");
			buff.append("	AND b.isshow = 'Y' ");
			break;
		case ADD_BOARD:
			buff.append("INSERT INTO ");
			buff.append("	board(bno, title, body, writer) ");
			buff.append("VALUES( ");
			buff.append("	brdSeq.NEXTVAL, ?, ?, ? ");
			buff.append(") ");
			break;
		}
		
		return buff.toString();
	}
}
