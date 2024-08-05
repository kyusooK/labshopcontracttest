package labshopcontracttest.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory", url = "${api.url.inventory}")
public interface InventoryService {
    @GetMapping(path = "/inventories/search/findByGetInventory/{id}")
    public Inventory testInventory(
        @PathVariable("id") Long id,
        GetInventoryQuery getInventoryQuery
    );
}
