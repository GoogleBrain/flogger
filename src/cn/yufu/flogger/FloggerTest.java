package cn.yufu.flogger;

import com.cyfonly.flogger.FLogger;
import com.cyfonly.flogger.constants.Constant;

public class FloggerTest {

	public static void main(String[] args) {
		// ��ȡ����
		FLogger logger = FLogger.getInstance();
		// ���api,ֻ��ָ������
		logger.info("Here is your message...");
		// ָ����־��������ݣ��ļ����Զ�ӳ��
		logger.writeLog(Constant.INFO, "Here is your customized level message...");
		// ָ����־����ļ�������־���������
		logger.writeLog("error", Constant.ERROR, "Here is your customized log file and level message...");
	}

}