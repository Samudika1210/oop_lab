package dao;

import java.sql.*;

public class TaskDAO {
    
    public boolean addTask(model.Task task) throws SQLException {
        String sql = "INSERT INTO tasks (task_id, task_title, status) VALUES (?, ?, ?)";
        try (Connection conn = dao.DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, task.getTaskId());
            stmt.setString(2, task.getTaskTitle());
            stmt.setString(3, task.getStatus());
            return stmt.executeUpdate() > 0;
        }
    }

    public model.Task searchTask(int taskId) throws SQLException {
        String sql = "SELECT * FROM tasks WHERE task_id = ?";
        try (Connection conn = dao.DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, taskId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new model.Task(
                        rs.getInt("task_id"),
                        rs.getString("task_title"),
                        rs.getString("status")
                    );
                }
            }
        }
        return null;
    }

    public boolean updateTask(model.Task task) throws SQLException {
        String sql = "UPDATE tasks SET task_title = ?, status = ? WHERE task_id = ?";
        try (Connection conn = dao.DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, task.getTaskTitle());
            stmt.setString(2, task.getStatus());
            stmt.setInt(3, task.getTaskId());
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean deleteTask(int taskId) throws SQLException {
        String sql = "DELETE FROM tasks WHERE task_id = ?";
        try (Connection conn = dao.DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, taskId);
            return stmt.executeUpdate() > 0;
        }
    }
}