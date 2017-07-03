/**
 * Created by mumarm45 on 03/07/2017.
 */
class Prompts {

    private String domain,username,password,machineIp,sharedFolder;
    private String databaseMachineIp,databaseName,databaseUsername,databasePassword;
    int ciscoType;
    private  String primaryIp,primaryUsername,primaryPassword;
    private  String secondaryIp,secondaryUsername,secondaryPassword;
    private String webRequest;

    private static Prompts prompts = null;

    public static Prompts getInstance(){
        if(prompts == null){
            prompts = new Prompts();
        }

        return  prompts;
    }


    String getWebRequest() {
        return webRequest;
    }

    void setWebRequest(String webRequest) {
        this.webRequest = webRequest;
    }

    String getPrimaryIp() {
        return primaryIp;

    }

    void setPrimaryIp(String primaryIp) {
        this.primaryIp = primaryIp;
    }

    String getPrimaryUsername() {
        return primaryUsername;
    }

    void setPrimaryUsername(String primaryUsername) {
        this.primaryUsername = primaryUsername;
    }

    String getPrimaryPassword() {
        return primaryPassword;
    }

    void setPrimaryPassword(String primaryPassword) {
        this.primaryPassword = primaryPassword;
    }

    String getSecondaryIp() {
        return secondaryIp;
    }

    void setSecondaryIp(String secondaryIp) {
        this.secondaryIp = secondaryIp;
    }

    String getSecondaryUsername() {
        return secondaryUsername;
    }

    void setSecondaryUsername(String secondaryUsername) {
        this.secondaryUsername = secondaryUsername;
    }

    String getSecondaryPassword() {
        return secondaryPassword;
    }

    void setSecondaryPassword(String secondaryPassword) {
        this.secondaryPassword = secondaryPassword;
    }

    String getDatabaseMachineIp() {
        return databaseMachineIp;
    }

    void setDatabaseMachineIp(String databaseMachineIp) {
        this.databaseMachineIp = databaseMachineIp;
    }

    String getDatabaseName() {
        return databaseName;
    }

    void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    String getDatabaseUsername() {
        return databaseUsername;
    }

    void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    String getDatabasePassword() {
        return databasePassword;
    }

    void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    int getCiscoType() {
        return ciscoType;
    }

    void setCiscoType(int ciscoType) {
        this.ciscoType = ciscoType;
    }

    String getDomain() {
        return domain;
    }

    void setDomain(String domain) {
        this.domain = domain;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getMachineIp() {
        return machineIp;
    }

    void setMachineIp(String machineIp) {
        this.machineIp = machineIp;
    }

    String getSharedFolder() {
        return sharedFolder;
    }

    void setSharedFolder(String sharedFolder) {
        this.sharedFolder = sharedFolder;
    }


    @Override
    public String toString() {
        return "Prompts{" +
                "domain='" + domain + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", machineIp='" + machineIp + '\'' +
                ", sharedFolder='" + sharedFolder + '\'' +
                ", databaseMachineIp='" + databaseMachineIp + '\'' +
                ", databaseName='" + databaseName + '\'' +
                ", databaseUsername='" + databaseUsername + '\'' +
                ", databasePassword='" + databasePassword + '\'' +
                ", ciscoType=" + ciscoType +
                ", primaryIp='" + primaryIp + '\'' +
                ", primaryUsername='" + primaryUsername + '\'' +
                ", primaryPassword='" + primaryPassword + '\'' +
                ", secondaryIp='" + secondaryIp + '\'' +
                ", secondaryUsername='" + secondaryUsername + '\'' +
                ", secondaryPassword='" + secondaryPassword + '\'' +
                ", webRequest='" + webRequest + '\'' +
                '}';
    }
}

