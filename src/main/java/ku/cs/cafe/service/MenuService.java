package ku.cs.cafe.service;

import ku.cs.cafe.entity.Menu;
import ku.cs.cafe.model.MenuRequest;
import ku.cs.cafe.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public void createMenu(MenuRequest menu){
        Menu record = modelMapper.map(menu, Menu.class);
        menuRepository.save(record);
    }
}
