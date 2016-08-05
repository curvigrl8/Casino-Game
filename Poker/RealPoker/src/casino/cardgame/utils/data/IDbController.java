//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : IDbController.java
//  @ Date : 5/27/2012
//  @ Author : sangdn
//
//



package casino.cardgame.utils.data;

import casino.cardgame.entity.LeaderBoardInfo;
import casino.cardgame.entity.LoginHistory;
import casino.cardgame.entity.RoomHistory;
import casino.cardgame.entity.ServerStateHistory;
import casino.cardgame.entity.TableResult;
import casino.cardgame.entity.TopWinnerInfo;
import casino.cardgame.entity.TransactionInfo;
import casino.cardgame.entity.UserInfo;
import casino.cardgame.entity.game.TableHistory;
import hirondelle.date4j.DateTime;
import java.util.List;


public interface IDbController {
	 //GET DATA API INTERFACE
	public casino.cardgame.entity.UserInfo GetUserInfo(String strUserName) ;
	
	public String GetUserPassword(String strUserName) ;
	
        public String GetAdminPassword(String adminName) ;
	
	public casino.cardgame.entity.TableResult GetTableResult(String strTableID) ;
	
	public casino.cardgame.entity.TransactionInfo GetTransactionInfo(String strOwnerName) ;
	
	public List<TransactionInfo> GetTransactionHistory(String strOwnerName, DateTime fromDate, DateTime toDate) ;
	
	public List<TransactionInfo> GetTransactionHistory(String strOwnerName, int fromIndex, int numRecord) ;
	
	public casino.cardgame.entity.game.TableHistory GetTableHistory(int tableID) ;
	
        //khoatd List<ILoginHistory>
	public List<LoginHistory> GetLoginHistory(String strUserName, DateTime fromDate, DateTime toDate) ;
	
	public List<LoginHistory> GetLoginHistory(String strUserName, int fromIndex, int numRecord) ;
	
	public List<RoomHistory> GetCreatedRoomHistory(DateTime fromDate, DateTime toDate) ;
	
	public List<RoomHistory> GetCreatedRoomHistory(int fromIndex, int numRecord) ;
	
	public List<ServerStateHistory> GetServerStateHistory(DateTime fromDate, DateTime toDate) ;
	
	public List<ServerStateHistory> GetServerStateHistory(int fromIndex, int numRecord) ;
        //end khoatd
	
	public List<LeaderBoardInfo> GetLeaderBoard();
	
	public List<TopWinnerInfo> GetTopWiner();
  //SET & SAVE DATA API
        public void addUserInfo(UserInfo info);        
        public void addUserPass(String strUserName, String pass);
        public void addTableResult(TableResult result);
        public void addTransactionInfo(TransactionInfo trans) throws Exception;
        public void addChipForUser(String userName, double amount) throws Exception;
        public void addTableHistory(TableHistory tblHistory);
        public void addLoginHistory(LoginHistory loginHistory);
        public void addRoomHistory(RoomHistory room);
        
}