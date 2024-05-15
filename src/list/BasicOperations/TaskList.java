package list.BasicOperations;

import list.BasicOperations.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    protected static final String REMOVE_ALL_TASKS_COMMAND = "Remove All";

    private List<Task> taskList;


    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        taskList.add(newTask);
        System.out.println("New task added: " + newTask.getDescription());
    }

    public void removeTask(String description) {
        List<Task> tasksToBeRemoved = new ArrayList<>();
        if (!taskList.isEmpty()) {

            for (Task task : taskList) {
                if (description.equalsIgnoreCase(REMOVE_ALL_TASKS_COMMAND)) {
                    taskList.clear();
                    break;
                }
                else if (task.getDescription().equalsIgnoreCase(description)) {
                    tasksToBeRemoved.add(task);

                }
                System.out.println("All tasks removed");
            }
            taskList.removeAll(tasksToBeRemoved);
        } else {
            System.out.println("No task found");
        }
    }

    public int getTotalNumberTasks() {
        return taskList.size();
    }

    public void getTaskDescription() {
        if (!taskList.isEmpty()) {
            for (Task task : taskList) {
                System.out.println(task.getDescription());
            }
        } else {
            System.out.println("No tasks found");
        }
    }


    public static void main(String[] args) {
        // Create instance of class TaskList
        TaskList tasks = new TaskList();

        // Add tasks to the list
        tasks.addTask("Wake up leite 8 o'clock.");
        tasks.addTask("Study Santander backend bootcamp on Dio.");
        tasks.addTask("Finish the challenges.");

        // Show the total task numbers in the list
        System.out.println("You have " + tasks.getTotalNumberTasks() + " tasks on list.");

        // Show all task's descriptions from list
        tasks.getTaskDescription();

        // Remove a task from list by description
        tasks.removeTask("Finish the challenges.");

        // Show the total numbers of tasks after deleted task
        System.out.println("You have " + tasks.getTotalNumberTasks() + " tasks on list.");

        // Exibindo as descrições das tarefas atualizadas na lista
        tasks.getTaskDescription();

        // Removendo uma tarefa da lista quando a lista está vazia.
        tasks.removeTask(REMOVE_ALL_TASKS_COMMAND);
        tasks.removeTask("Study Santander backend bootcamp on Dio.");

        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("You have " + tasks.getTotalNumberTasks() + " tasks on list.");
    }

}

