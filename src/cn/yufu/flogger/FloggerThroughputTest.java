package cn.yufu.flogger;

import com.cyfonly.flogger.FLogger;
import com.cyfonly.flogger.constants.Constant;

/**
 * FLoggerÕÃÕ¬¡ø≤‚ ‘¿‡
 * 
 * @author yunfeng.cheng
 * @create 2017-02-08
 */
public class FloggerThroughputTest {
	private static FLogger flogger = FLogger.getInstance();

	public static void main(String[] args) throws InterruptedException {
		flogger.writeLog("error", Constant.ERROR, "Here is your customized ERROR log file and level message...");
		flogger.writeLog("info", Constant.INFO, "Here is your customized INFO log file and level message...");
	}

}