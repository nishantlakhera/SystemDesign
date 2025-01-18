public class TaskManagementApp {
    public static void main(String[] args) {
        Task task1 = new SimpleTask("Complete Coding");
        Task task2 = new SimpleTask("Complete Testing");

        TaskList projectTasks = new TaskList("Project Tasks");
        projectTasks.addTask(task1);
        projectTasks.addTask(task2);

        TaskList phase1Tasks = new TaskList("Phase 1 tasks");
        phase1Tasks.addTask(new SimpleTask("Design"));
        phase1Tasks.addTask(new SimpleTask("Implementation"));

        projectTasks.addTask(phase1Tasks);
        projectTasks.display();

    }
}
