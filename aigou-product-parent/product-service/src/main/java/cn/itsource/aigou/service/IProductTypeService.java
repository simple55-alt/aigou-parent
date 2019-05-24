package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author solargen
 * @since 2019-05-16
 */
public interface IProductTypeService extends IService<ProductType> {

    List<ProductType> loadTreeData();

    void generateStaticPage();

    String getPathById(Long id);
}
