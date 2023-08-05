package com.example.inventory.api;

import com.example.inventory.domain.Inventory;
import com.example.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryApi {

  private final InventoryRepository inventoryRepository;

  @Autowired
  public InventoryApi(InventoryRepository inventoryRepository) {
    this.inventoryRepository = inventoryRepository;
  }

  @GetMapping("/{productId}")
  public ResponseEntity<Inventory> getProductInventory(@PathVariable Long productId) {
    var result = inventoryRepository.findById(productId)
      .orElseThrow(() -> new RuntimeException("Inventory not found"));
    return ResponseEntity.ok(result);
  }
}

