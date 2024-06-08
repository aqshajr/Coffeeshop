package Model.Riwayat;

import Model.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAORiwayat implements InterfaceDAORiwayat {
    
    @Override
    public int insert(ModelRiwayat riwayat) {
       int idBaru = -1;
       try {
            String query = "INSERT INTO riwayat (nama, menu, hotice, size, sweetness, dairy, topping, notes, ttlharga) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, riwayat.getNama()); //? ke-1
            statement.setString(2, riwayat.getMenu()); //? ke-1
            statement.setString(3, riwayat.getHotIce()); //? ke-1
            statement.setString(4, riwayat.getSize()); //? ke-1
            statement.setString(5, riwayat.getSweetness()); //? ke-1
            statement.setString(6, riwayat.getDairy()); //? ke-1
            statement.setString(7, riwayat.getTopping()); //? ke-1
            statement.setString(8, riwayat.getNotes()); //? ke-1
            statement.setInt(9, riwayat.getTtlharga());
            
            statement.executeUpdate();
            
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    idBaru = generatedKeys.getInt(1);
                }
            }
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal input data.
            System.out.println("Input gagal: " + e.getLocalizedMessage());
        } 
       return idBaru;
    }

    @Override
    public void delete(int id) {
        try {
            String query = "DELETE FROM riwayat WHERE id=?;";
            
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id);
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Delete gagal: " + e.getLocalizedMessage());
        }
    }

        @Override
    public int getTotalPendapatan() {   
    int totalPendapatan = 0;
    String query = "SELECT SUM(ttlharga) FROM riwayat;";
        try (

            PreparedStatement statement = Connector.Connect().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                totalPendapatan = resultSet.getInt(1);
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }

        return totalPendapatan;    
    }

    @Override
    public List<ModelRiwayat> getAll() {
         List<ModelRiwayat> listRiwayat = null;

        try {
            listRiwayat = new ArrayList<>();
            
            Statement statement = Connector.Connect().createStatement();
            
            String query = "SELECT * FROM riwayat;"; 
            
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                ModelRiwayat rw = new ModelRiwayat();
                
                rw.setId(resultSet.getInt("id"));
                rw.setNama(resultSet.getString("nama"));
                rw.setMenu(resultSet.getString("menu"));
                rw.setTtlharga(resultSet.getInt("ttlharga"));
                
                listRiwayat.add(rw);
            }
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return listRiwayat;
    }

    @Override
    public void deleteAll() {
        try {
            String query = "DELETE FROM riwayat;";
            
            PreparedStatement statement = Connector.Connect().prepareStatement(query);
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Delete semua gagal: " + e.getLocalizedMessage());
        }
    }

    @Override
    public void updateTotal(ModelRiwayat riwayatYangMauDiedit) {
        try {
            String query = "UPDATE riwayat SET ttlharga=? WHERE id=?;";
            
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, riwayatYangMauDiedit.getTtlharga());
            statement.setInt(2, riwayatYangMauDiedit.getId());
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Update gagal! (" + e.getMessage() + ")");
        }    
    }


}

