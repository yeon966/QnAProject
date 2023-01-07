package lobby;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import object.Attacker;
import object.User;
import rankingInquiry.UserRankDialog;

public interface LobbyService {
	public void readUserinfo(DefaultTableModel model, User user);
	public void infomationFiltering(String getText, TableRowSorter<TableModel> sorter);
	public boolean isRowSelected(JTable table);
	public List<Attacker> makeAttackerList(String userId);
	public void setUserRanking(UserRankDialog urd, List<Attacker> attackerList);
}
