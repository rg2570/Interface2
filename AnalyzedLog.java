import java.time.LocalDate;
import java.util.Objects;

public class AnalyzedLog {
    // POJO

    public String ipAddress;
    public String timeStamp ;
    public String callMethod;
    public int responseCode;
    public int returnSize;

    public AnalyzedLog(String ipAddress, String timeStamp, String callMethod, int responseCode, int returnSize) {
        this.ipAddress = ipAddress;
        this.timeStamp = timeStamp;
        this.callMethod = callMethod;
        this.responseCode = responseCode;
        this.returnSize = returnSize;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getCallMethod() {
        return callMethod;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public int getReturnSize() {
        return returnSize;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setCallMethod(String callMethod) {
        this.callMethod = callMethod;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setReturnSize(int returnSize) {
        this.returnSize = returnSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnalyzedLog that = (AnalyzedLog) o;
        return responseCode == that.responseCode &&
                returnSize == that.returnSize &&
                ipAddress.equals(that.ipAddress) &&
                timeStamp.equals(that.timeStamp) &&
                callMethod.equals(that.callMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, timeStamp, callMethod, responseCode, returnSize);
    }

}
