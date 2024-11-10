USE [Plants]
GO

/****** Object:  Table [dbo].[PlantsLightLevel]    Script Date: 11/10/2024 12:18:39 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[PlantsLightLevel](
	[PlantID] [int] NOT NULL,
	[LightLevelID] [int] NOT NULL
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[PlantsLightLevel]  WITH CHECK ADD  CONSTRAINT [FK_PlansLightLevel_LightLevel] FOREIGN KEY([LightLevelID])
REFERENCES [dbo].[LightLevel] ([LightLevelID])
GO

ALTER TABLE [dbo].[PlantsLightLevel] CHECK CONSTRAINT [FK_PlansLightLevel_LightLevel]
GO

ALTER TABLE [dbo].[PlantsLightLevel]  WITH CHECK ADD  CONSTRAINT [FK_PlansLightLevel_Plants] FOREIGN KEY([PlantID])
REFERENCES [dbo].[Plants] ([PlantID])
GO

ALTER TABLE [dbo].[PlantsLightLevel] CHECK CONSTRAINT [FK_PlansLightLevel_Plants]
GO

