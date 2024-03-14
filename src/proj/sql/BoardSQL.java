package proj.sql;

public class BoardSQL {
	public static final int SEL_ALL_LIST 	= 1001;
	public static final int SEL_DETAIL		= 1002;
	public static final int SEL_BNO_LIST 	= 1003;
	public static final int SEL_MIBNO_LIST 	= 1004;
	public static final int SEL_BNO_BODY 	= 1005;
	
	
	public static final int ADD_VIEWS 		= 2001;
	public static final int EDIT_BODY 		= 2002;
	public static final int DEL_BNO 		= 2003;
	
	
	public static final int ADD_BOARD 		= 3001;
	
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
		case SEL_DETAIL:
			buff.append("SELECT ");
			buff.append("	bno, title, id, wdate, body, views ");
			buff.append("FROM ");
			buff.append("	board, member ");
			buff.append("WHERE ");
			buff.append("	mno = writer ");
			buff.append("	AND bno = ? ");
			break;
		case SEL_BNO_LIST:
			buff.append("SELECT ");
			buff.append("	bno ");
			buff.append("FROM ");
			buff.append("	board ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			break;
		case SEL_MIBNO_LIST:
			buff.append("SELECT ");
			buff.append("	bno ");
			buff.append("FROM ");
			buff.append("	board ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("	AND writer = ? ");
			break;
		case SEL_BNO_BODY:
			buff.append("SELECT ");
			buff.append("	body ");
			buff.append("FROM ");
			buff.append("	board ");
			buff.append("WHERE ");
			buff.append("	bno = ? ");
			break;
		case ADD_VIEWS:
			buff.append("UPDATE ");
			buff.append("	board ");
			buff.append("SET ");
			buff.append("	views = views + 1 ");
			buff.append("WHERE ");
			buff.append("	bno = ? ");
			break;
		case EDIT_BODY:
			buff.append("UPDATE ");
			buff.append("	board ");
			buff.append("SET ");
			buff.append("	body = ? ");
			buff.append("WHERE ");
			buff.append("	bno = ? ");
			break;
		case DEL_BNO:
			buff.append("UPDATE ");
			buff.append("	board ");
			buff.append("SET ");
			buff.append("	isshow = 'N' ");
			buff.append("WHERE ");
			buff.append("	bno = ? ");
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
