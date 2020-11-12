import java.time.LocalDate;
import java.util.ArrayList;

public class LogAnalyzerImpl implements LogAnalyzer {

    @Override
    public AnalyzedLog parse(String logLine) {
        String ipAddress = logLine.split(" ")[0];
        String timeStamp = logLine.split(" ")[4];
        String callMethod = logLine.split(" ")[5];
        int responseCode = Integer.parseInt(logLine.split(" ")[6]);
        int returnSize = Integer.parseInt(logLine.split(" ")[7]);
        return new AnalyzedLog(ipAddress, timeStamp, callMethod, responseCode, returnSize);
    }
}
