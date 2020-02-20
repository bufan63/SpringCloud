package com.open.codegen.controller;

import cn.hutool.core.io.IoUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.open.codegen.entity.GenConfig;
import com.open.codegen.service.GeneratorService;
import com.open.common.core.util.R;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * 代码生成器
 */
@RestController
@AllArgsConstructor
@RequestMapping("/generator")
public class GeneratorController {
	private final GeneratorService generatorService;

	/**
	 * 列表
	 *
	 * @param tableName 参数集
	 * @param id        数据源编号
	 * @return 数据库表
	 */
	@GetMapping("/page")
	public R getPage(Page page, String tableName, Integer id) {
		return R.ok(generatorService.getPage(page, tableName, id));
	}

	/**
	 * 生成代码
	 */
	@SneakyThrows
	@PostMapping("/code")
	public void generatorCode(@RequestBody GenConfig genConfig, HttpServletResponse response) {
		byte[] data = generatorService.generatorCode(genConfig);
		response.reset();
		response.setHeader(HttpHeaders.CONTENT_DISPOSITION, String.format("attachment; filename=%s.zip", genConfig.getTableName()));
		response.addHeader(HttpHeaders.CONTENT_LENGTH, String.valueOf(data.length));
		response.setContentType("application/octet-stream; charset=UTF-8");

		IoUtil.write(response.getOutputStream(), Boolean.TRUE, data);
	}
}
