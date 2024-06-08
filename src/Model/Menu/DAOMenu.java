package Model.Menu;

import Model.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOMenu implements InterfaceDAOMenu {

    @Override
    public void insert(ModelMenu menu) {
       try {
            String query = "INSERT INTO menu (nama, harga, jenis) VALUES (?, ?, ?);";

            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, menu.getNama()); //? ke-1
            statement.setInt(2, menu.getHarga()); //? ke-2
            statement.setString(3, menu.getJenis()); //? ke-3
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e) {
            // Menampilkan pesan error ketika gagal input data.
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        } 
    }

    @Override
    public void update(ModelMenu menu) {
        try {
            String query = "UPDATE menu SET nama=?, harga=?, jenis=? WHERE id=?;";
            
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, menu.getNama());
            statement.setInt(2, menu.getHarga());
            statement.setString(3, menu.getJenis());
            statement.setInt(4, menu.getId());
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Update gagal! (" + e.getMessage() + ")");
        }
    }

    @Override
    public void delete(int id) {
        try {
            String query = "DELETE FROM menu WHERE id=?;";
            
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
    public List<ModelMenu> getAll() {
         List<ModelMenu> listMenu = null;

        try {
            listMenu = new ArrayList<>();
            
            Statement statement = Connector.Connect().createStatement();
            
            String query = "SELECT * FROM menu;";
            
            ResultSet resultSet = statement.executeQuery(query);
            

            while (resultSet.next()) {
                ModelMenu mn = new ModelMenu();
                
                mn.setId(resultSet.getInt("id"));
                mn.setNama(resultSet.getString("nama"));
                mn.setHarga(resultSet.getInt("harga"));
                mn.setJenis(resultSet.getString("jenis"));
                
                listMenu.add(mn);
            }
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
        return listMenu;
    }

    @Override
    public List<ModelMenuNA> getNA() {
         List<ModelMenuNA> listMenuNA = null;

        try {
            listMenuNA = new ArrayList<>();
            
            Statement statement = Connector.Connect().createStatement();
            
            String query = "SELECT * FROM menu WHERE jenis != 'Additional';";
            
            ResultSet resultSet = statement.executeQuery(query);
            

            while (resultSet.next()) {
                ModelMenuNA mn = new ModelMenuNA();
                
                //mn.setId(resultSet.getInt("id"));
                mn.setNama(resultSet.getString("nama"));
                mn.setHarga(resultSet.getInt("harga"));
                
                listMenuNA.add(mn);
            }
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
        return listMenuNA;
    }

    @Override
    public int getHargaDefault(String gmenu) {
        int hargaDefault = 0;
        String query = "SELECT harga FROM menu WHERE nama=? AND jenis='Minuman';";
        
        try (
            Connection connection = Connector.Connect();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, gmenu);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    hargaDefault = resultSet.getInt("harga");
                }
            }
        } catch (SQLException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
        
        return hargaDefault;
    }

    @Override
    public int getHargaSize(String gsize) {
        int hargaSize = 0;
        String query = "SELECT harga FROM menu WHERE nama=? AND jenis='Additional';";
        
        try (
            Connection connection = Connector.Connect();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, gsize);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    hargaSize = resultSet.getInt("harga");
                }
            }
        } catch (SQLException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
        
        return hargaSize;
    }

    @Override
    public int getHargaTopping(String gtopping) {
        int hargaTopping = 0;
        String query = "SELECT harga FROM menu WHERE nama=? AND jenis='Additional';";
        
        try (
            Connection connection = Connector.Connect();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, gtopping);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    hargaTopping = resultSet.getInt("harga");
                }
            }
        } catch (SQLException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
        
        return hargaTopping;
    }

    @Override
    public int getHargaDairy(String gdairy) {
        int hargaDairy = 0;
        String query = "SELECT harga FROM menu WHERE nama=? AND jenis='Additional'";
        
        try (
            Connection connection = Connector.Connect();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, gdairy);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    hargaDairy = resultSet.getInt("harga");
                }
            }
        } catch (SQLException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
        
        return hargaDairy;
    }

    @Override
    public void updateAdditional(ModelMenu menu) {
        try {
            String query = "UPDATE menu SET harga=? WHERE id=?;";
            
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, menu.getHarga());
            statement.setInt(2, menu.getId());
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Update gagal! (" + e.getMessage() + ")");
        }
    }
}
