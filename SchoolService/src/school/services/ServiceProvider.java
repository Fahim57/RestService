package school.services;

public class ServiceProvider {
    private static SchoolService schoolService = new SchoolService();
    public static SchoolService getSchoolService() {
        return schoolService;
    }
}
